package com.devmaster.lesson6thuchanh.controller;

import com.devmaster.lesson6thuchanh.dto.CustomerDTO;
import com.devmaster.lesson6thuchanh.entity.Customer;
import com.devmaster.lesson6thuchanh.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    // hien thi người dùng
    @GetMapping
    public String getCustomers(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "customers/customer-list";
    }

    @GetMapping("/add-new")
    public String addNewCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        return "customers/customer-add";
    }

    @GetMapping("/edit/{id}")
    public String showFormUpdate(@PathVariable(value = "id") Long id, Model model) {
        CustomerDTO customer = customerService.findById(id)
                .orElseThrow(()->new IllegalArgumentException("Invalid customer Id:" +id));
        model.addAttribute("customer", customer);
        return "customers/customer-edit";


    }

    @PostMapping
    public String saveCustomer(@ModelAttribute("customer") CustomerDTO customer) {
        customerService.save(customer);
        return "redirect:/customers";
    }

    @PostMapping("/update/{id}")
    public String updateCustomer(@PathVariable(value = "id") Long id, CustomerDTO customerDTO) {
        customerService.updateById(id, customerDTO);
        return "redirect:/customers";
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable(value = "id") Long id) {
        customerService.deleteById(id);
        return "redirect:/customers";
    }
}
