package com.devmaster.lesson07_thuchanh.controller;

import com.devmaster.lesson07_thuchanh.entity.Book;
import com.devmaster.lesson07_thuchanh.service.BookService;
import com.devmaster.lesson07_thuchanh.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public String getBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "book/book-list";
    }

    @GetMapping("/create")
    public String createBook(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("categories", categoryService.findAll());
        return "book/book-form";
    }

    @GetMapping("/create/{id}")
    public String createBook(@PathVariable Long id, Model model) {
        model.addAttribute("book", bookService.getAllBooks());
        model.addAttribute("categories", categoryService.findAll());
        return "book/book-form";
    }

    @PostMapping("/create")
    public String createBook(@ModelAttribute("book") Book book) {
        bookService.saveBook(book);
        return "redirect:/book";
    }
    @PostMapping("/create/{id}")
    public String updateBook(@PathVariable Long id, @ModelAttribute("book") Book book) {
        book.getId();
        bookService.saveBook(book);
        return "redirect:/book";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteBookById(id);
        return "redirect:/book";
    }
}
