package com.devmaster.lesson08_thuchanh_bai3.controller;

import com.devmaster.lesson08_thuchanh_bai3.entity.Configuration;
import com.devmaster.lesson08_thuchanh_bai3.entity.Product;
import com.devmaster.lesson08_thuchanh_bai3.service.ConfigurationService;
import com.devmaster.lesson08_thuchanh_bai3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private ConfigurationService configurationService;

    private static final String UPLOAD_DIR = "src/main/resources/static/";
    private static final String UPLOAD_PathFile="images/products/";

    @GetMapping
    public String getProducts(Model model) {
        model.addAttribute("products", productService.findAll());
        return "products/product-list";
    }
    @GetMapping("/create")
    public String createProduct(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("configs", configurationService.getAllConfigurations());
        return "products/product-form";
    }
    @PostMapping("/create")
    public String saveProduct(@ModelAttribute("product") Product product,
                           @RequestParam List<Long> configIds,
                           @RequestParam("imageProduct") MultipartFile imageFile) {
        // Kiểm tra nếu có ảnh được tải lên
        if (!imageFile.isEmpty()) {
            try {
                // Tạo đường dẫn thư mục lưu ảnh
                Path uploadPath = Paths.get(UPLOAD_DIR + UPLOAD_PathFile);

                // Nếu thư mục chưa tồn tại, tạo mới
                if (!Files.exists(uploadPath)) {
                    Files.createDirectories(uploadPath);
                }

                // Lấy tên file gốc và phần mở rộng
                String originalFileName = StringUtils.cleanPath(imageFile.getOriginalFilename());
                String fileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));

                // Tạo tên file mới dựa trên mã sách
                String newFileName = product.getName() + fileExtension;
                Path filePath = uploadPath.resolve(newFileName);

                // Lưu file ảnh vào thư mục
                Files.copy(imageFile.getInputStream(), filePath);

                // Lưu đường dẫn ảnh vào thuộc tính imgUrl của sách
                product.setImgUrl("/" + UPLOAD_PathFile + newFileName);
            } catch (IOException e) {
                e.printStackTrace(); // Ghi log lỗi nếu có
            }
        }

        // Lấy danh sách tác giả theo ID và gán vào sách
        List<Configuration> configurations = new ArrayList<>(configurationService.getAllConfigurationById(configIds));
        product.setConfigurations(configurations);

        // Lưu sách vào database
        productService.save(product);

        // Chuyển hướng về danh sách sách
        return "redirect:/products";
    }

    @GetMapping("/edit/{id}")
    public String editProduct(@PathVariable Long id, Model model) {
        Product product = productService.findById(id);

        // Lấy danh sách ID của các configuration đã chọn
        List<Long> configIds = product.getConfigurations().stream()
                .map(Configuration::getId)
                .toList();

        model.addAttribute("product", product);
        model.addAttribute("configs", configurationService.getAllConfigurations());
        model.addAttribute("selectedConfigIds", configIds); // Thêm danh sách ID vào model

        return "products/product-form";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.delete(id);
        return "redirect:/products";
    }
}
