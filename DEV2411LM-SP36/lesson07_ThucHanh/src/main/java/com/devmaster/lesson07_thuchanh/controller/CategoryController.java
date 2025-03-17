package com.devmaster.lesson07_thuchanh.controller;

import com.devmaster.lesson07_thuchanh.entity.Category;
import com.devmaster.lesson07_thuchanh.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public String getCategory(Model model) {
        model.addAttribute("categories", categoryService.findAll());
        return "category/category-list";
    }

    @GetMapping("/create")
    public String createCategory(Model model) {
        model.addAttribute("category", new Category());
        return "category/category-form";
    }

    @GetMapping("/edit/{id}")
    public String editCategory(Model model, @PathVariable Long id) {
        model.addAttribute("category", categoryService.findById(id).orElse(null));
        return "category/category-form";
    }

    @PostMapping("/create")
    public String createCategory(Model model, @ModelAttribute Category category) {
        categoryService.save(category);
        return "redirect:/category";
    }

    @PostMapping("/create/{id}")
    public String editCategory(Model model, @PathVariable Long id, @ModelAttribute Category category) {
        category.setId(id);
        categoryService.save(category);
        return "redirect:/category";
    }

    @GetMapping("/delete/{id}")
    public String deleteCategory(Model model, @PathVariable Long id) {
        categoryService.deleteById(id);
        return "redirect:/category";
    }
}
