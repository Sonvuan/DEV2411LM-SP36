package com.devmaster.lessson6.service;

import com.devmaster.lessson6.entity.User;
import com.devmaster.lessson6.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // Lấy toàn bộ người dùng
    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    // lấy người dùng theo id
    public User getUserById(Long id){
        return userRepository.findById(id).get();
    }

    // tạo mới người dùng
    public User createUser(User user){
        return userRepository.save(user);
    }

    // cập nhật người dùng
    public User updateUser(User user){
        return userRepository.save(user);
    }

    // xóa người dùng
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
