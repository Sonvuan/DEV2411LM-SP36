package com.devmaster.lesson02.pkg_annotation.controller;


import com.devmaster.lesson02.pkg_annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/users")
    public String getUsers() {
        return userService.getUserDetails();
    }
    @PostMapping
    public String createUser() {
        return "<h1> Create new user";
    }
    @PutMapping("/users/{id}")
    public String updateUser(@PathVariable int id) {
        return "<h1> Update user with id: " + id+ "update";
    }
    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id) {
        return "<h1> Delete user with id: " + id+ "delete";
    }
}
