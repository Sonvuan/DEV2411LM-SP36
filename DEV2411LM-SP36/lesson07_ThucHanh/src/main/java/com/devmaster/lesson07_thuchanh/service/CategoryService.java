package com.devmaster.lesson07_thuchanh.service;

import com.devmaster.lesson07_thuchanh.entity.Category;
import com.devmaster.lesson07_thuchanh.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;


    // lâsy danh sách category
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    // lấy category theo id
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    // cập nhật dữ liệu
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    // xóa category theo id
    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }
}
