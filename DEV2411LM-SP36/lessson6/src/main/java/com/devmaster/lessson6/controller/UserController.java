package com.devmaster.lessson6.controller;

import com.devmaster.lessson6.entity.User;
import com.devmaster.lessson6.repository.UserRepository;
import com.devmaster.lessson6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    // lấy danh sách người dùng
    @GetMapping
    public String listUsers(Model model) {
        List<User> users = userService.getAllUser();
        model.addAttribute("users", users);
        return "user/list";
    }


    @GetMapping("/new")
    public String createUserForm(Model model) {
        User user = new User();
        user.setIsActive(true);
        model.addAttribute("user", user);
        return "user/form";
    }


    // tạo mới người dùng
    @PostMapping("/save")
    public String saveUser(@Validated @ModelAttribute("user") User user, BindingResult result, Model model) {
        if(userRepository.existsByUserName(user.getUserName()) && user.getId() == null ) {
            result.rejectValue("username", "error.user","Username đã tồn tại, Vui lòng chọn tên khác.");
            return "user/form"; // quay lại form nếu có lỗi
        } if(result.hasErrors()) {
            return "user/form";
        }userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("/edit/{id}")
    public String editUserForm(@PathVariable Long id, Model model) {
        User user = userService.getUserById(id).orElseThrow(()-> new
                IllegalArgumentException("Invalid user Id:" +id));
        model.addAttribute("user", user);
        return "user/form";
    }

    // xóa người dùng
    @DeleteMapping("/delete/{id}")
public String deleteUser(@PathVariable Long id, Model model) {
        userService.deleteUser(id);
        return "redirect:/users";
    }
}
