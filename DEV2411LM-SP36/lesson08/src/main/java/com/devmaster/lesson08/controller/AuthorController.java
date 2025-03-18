package com.devmaster.lesson08.controller;

import com.devmaster.lesson08.entity.Author;
import com.devmaster.lesson08.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("authors")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

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
    @PostMapping("/create")
    public String saveAuthor(@ModelAttribute("author") Author author) {
        authorService.save(author);
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
