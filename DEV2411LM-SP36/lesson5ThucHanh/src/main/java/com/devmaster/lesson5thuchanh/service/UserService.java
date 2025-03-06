package com.devmaster.lesson5thuchanh.service;

import com.devmaster.lesson5thuchanh.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final List<User> users = new ArrayList<User>();

    public UserService() {
        // Thêm dữ liệu mẫu
        users.add(new User(1L, "Nguyễn Văn A", "a@example.com"));
        users.add(new User(2L, "Trần Thị B", "b@example.com"));
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getUserById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    public void saveUser(User user) {
        if (user.getId() == null) {
            user.setId((long) (users.size() + 1)); // Tạo ID tự động
            users.add(user);
        } else {
            // Cập nhật user
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getId().equals(user.getId())) {
                    users.set(i, user);
                    break;
                }
            }
        }
    }

    public void deleteUser(Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}
