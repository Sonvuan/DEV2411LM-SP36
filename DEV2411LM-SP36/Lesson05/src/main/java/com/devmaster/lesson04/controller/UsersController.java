package com.devmaster.lesson04.controller;



import com.devmaster.lesson04.dto.UsersDTO;
import com.devmaster.lesson04.entity.Users;
import com.devmaster.lesson04.service.UsersService;
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
        return ResponseEntity.ok("User created successfully");
    }

}

