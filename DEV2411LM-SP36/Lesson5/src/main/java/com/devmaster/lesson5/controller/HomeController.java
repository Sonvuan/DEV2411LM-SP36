package com.devmaster.lesson5.controller;


import com.devmaster.lesson5.entity.Info;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/profile")
    public String profile( Model model) {
        // đưa dữ liệu từ controllẻ lên view (thymeleaf)
        List<Info> profile = new ArrayList<>();
        // tạo thông tin profile
        profile.add(new Info("Devmaster",
                "dev",
                "contact@devmaster.edu.vn",
                "https://devmaster.edu.vn"));
        // đưa profle vào model
        model.addAttribute("DevmasterProfile",profile);
        return "profile";
    }
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("title","Devmaster::Home");
        return "home";
    }
    @GetMapping("/about")
    public String about(Model model) {
        return "about";
    }
    @GetMapping("/contact")
    public String contact(Model model) {
        return "contact";
    }
}
