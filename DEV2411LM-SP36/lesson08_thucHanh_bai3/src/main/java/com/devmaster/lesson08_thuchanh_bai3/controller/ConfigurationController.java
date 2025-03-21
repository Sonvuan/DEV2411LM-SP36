package com.devmaster.lesson08_thuchanh_bai3.controller;

import com.devmaster.lesson08_thuchanh_bai3.entity.Configuration;
import com.devmaster.lesson08_thuchanh_bai3.service.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/config")
public class ConfigurationController {
    @Autowired
    private ConfigurationService configurationService;

    private static final String UPLOAD_DIR = "src/main/resources/";
    private static final String UPLOAD_PathFile="images/avatars/";

    @GetMapping
    public String configuration(Model model) {
        model.addAttribute("configs",configurationService.getAllConfigurations());
        return "configs/config-list";
    }
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("config",new Configuration());
        return "configs/config-form";
    }
    @PostMapping("/create")
    public String saveConfiguration(@ModelAttribute("config") Configuration configuration) {
        configurationService.saveConfiguration(configuration);
        return "redirect:/config";
    }
    @PostMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("config",configurationService.getConfigurationById(id));
        return "configs/config-form";
    }
    @GetMapping("/edit/{id}")
    public String delete(@PathVariable Long id, Model model) {
        configurationService.deleteConfigurationById(id);
        return "redirect:/config";
    }
}

