package com.devmaster.lessson6.controller;

import com.devmaster.lessson6.entity.User;
import com.devmaster.lessson6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    // lấy danh sách người dùng
    @GetMapping("/list")
    public List<User> getAllUsers() {
        return userService.getAllUser();
    }

    // lấy người dùng theo id
    @GetMapping("/{id}")
    public User findUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    // tạo mới người dùng
    @PostMapping("/add")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    // cập nhật người dùng
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable Long id) {
        User updatedUser = userService.updateUser(user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    // xóa người dùng
    @DeleteMapping("/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
