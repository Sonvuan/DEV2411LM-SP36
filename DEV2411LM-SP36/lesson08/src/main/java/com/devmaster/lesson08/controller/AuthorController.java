package com.devmaster.lesson08.controller;

import com.devmaster.lesson08.entity.Author;
import com.devmaster.lesson08.entity.Book;
import com.devmaster.lesson08.service.AuthorService;
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
@RequestMapping("authors")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    private static final String UPLOAD_DIR = "src/main/resources/static/";
    private static final String UPLOAD_PathFile="images/avatars/";

    @GetMapping
    public String getAuthors(Model model) {
        model.addAttribute("authors", authorService.findAll());
        return "authors/author-list";
    }
    @GetMapping("/create")
    public String newAuthor(Model model) {
        model.addAttribute("author", new Author());
        return "authors/author-form";
   }
//    @PostMapping("/create")
//    public String saveAuthor(@ModelAttribute("author") Author author) {
//        authorService.save(author);
//        return "redirect:/authors";
//    }

    @PostMapping("/create")
    public String saveBook(@ModelAttribute("author") Author author,
                           @RequestParam("imageAuthor") MultipartFile imageFile) {
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
                String newFileName = author.getCode() + fileExtension;
                Path filePath = uploadPath.resolve(newFileName);

                // Lưu file ảnh vào thư mục
                Files.copy(imageFile.getInputStream(), filePath);

                // Lưu đường dẫn ảnh vào thuộc tính imgUrl của sách
                author.setImgUrl("/" + UPLOAD_PathFile + newFileName);
            } catch (IOException e) {
                e.printStackTrace(); // Ghi log lỗi nếu có
            }
        }
        // Lưu sách vào database
        authorService.save(author);

        // Chuyển hướng về danh sách sách
        return "redirect:/authors";
    }

    @PostMapping("/edit/{id}")
    public String editAuthor(@PathVariable Long id, Model model) {
        model.addAttribute("author", authorService.findById(id));
        return "authors/author-form";
    }
    @GetMapping("/delete/{id}")
    public String deleteAuthor(@PathVariable Long id) {
        authorService.delete(id);
        return "redirect:/authors";
    }
}
