package com.devmaster.lesson05.controller;



import com.devmaster.lesson05.dto.UsersDTO;
import com.devmaster.lesson05.entity.Users;
import com.devmaster.lesson05.service.UsersService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping("/list")
    public List<Users> getAllUsers() {
        return usersService.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity<String> addUser(@Valid @RequestBody UsersDTO user) {
        usersService.create(user);
        return ResponseEntity.badRequest().body("User created successfully");
    }
}

