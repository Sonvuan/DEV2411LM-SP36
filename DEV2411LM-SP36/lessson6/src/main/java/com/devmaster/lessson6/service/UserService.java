package com.devmaster.lessson6.service;

import com.devmaster.lessson6.entity.User;
import com.devmaster.lessson6.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
//ACID
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // Lấy toàn bộ người dùng
    @Transactional
    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    // lấy người dùng theo id
    @Transactional
    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }

    @Transactional
    public User saveUser(User user){
        if(user.getId() == null){
            return userRepository.save(user);
        }
        User user1 = userRepository.findById(user.getId()).get();
        user1.setId(user.getId());
        user1.setFullName(user.getFullName());
        user1.setPassword(user.getPassword());
        user1.setEmail(user.getEmail());
        user1.setAddress(user.getAddress());
        user1.setPhone(user.getPhone());
        user1.setIsActive(user.getIsActive());
        return userRepository.save(user1);

    }

    // 10

    // xóa người dùng
    @Transactional
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
