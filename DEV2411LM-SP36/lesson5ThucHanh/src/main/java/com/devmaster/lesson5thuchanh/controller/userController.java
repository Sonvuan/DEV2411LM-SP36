package com.devmaster.lesson5thuchanh.controller;

import com.devmaster.lesson5thuchanh.entity.User;
import com.devmaster.lesson5thuchanh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class userController {
    @Autowired
    private UserService userService;
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        model.addAttribute("isUserPage", true);
        return "user/home";
    }

    @GetMapping("/about")
    public String about() {
        return "user/about";
    }

    @GetMapping("/contact")
    public String contact() {
        return "user/contact";
    }
}
