package com.devmaster.lesson07.controller;

import com.devmaster.lesson07.entity.Category;
import com.devmaster.lesson07.entity.Product;
import com.devmaster.lesson07.repository.ProductRepository;
import com.devmaster.lesson07.service.CategoryService;
import com.devmaster.lesson07.service.ProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProduceService produceService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public String listProducts(Model model) {
        model.addAttribute("products",produceService.getAllProducts());
        return "product/product-list";
    }

    // phải thêm  model.addAttribute("categories", categoryService.getAllCategories());
    // để phần thymeleaf có thể duyệt được danh sách
    // không thì sẽ không hiển thị được category
    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("categories", categoryService.getAllCategories());
        return "product/product-form";
    }

    // phải thêm  model.addAttribute("categories", categoryService.getAllCategories());
    // để phần thymeleaf có thể duyệt được danh sách
    // không thì sẽ không hiển thị được category
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("product", produceService.getProductById(id).orElse(null));
        model.addAttribute("categories", categoryService.getAllCategories());
        return "product/product-form";
    }
    @PostMapping("/create")
    public String saveProduct(@ModelAttribute("product") Product product) {
        produceService.saveProduct(product);
        return "redirect:/product";
    }
    @PostMapping("create/{id}")
    public String updateProduct(@PathVariable("id") Long id, @ModelAttribute("product") Product product) {
        product.setId(id);
        produceService.saveProduct(product);
        return "redirect:/product";
    }
    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Long id) {
        produceService.deleteProduct(id);
        return "redirect:/product";
    }
}
