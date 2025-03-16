package com.devmaster.lesson07.service;

import com.devmaster.lesson07.entity.Category;
import com.devmaster.lesson07.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    // lay danh sach
    public List<Category> getAllCategories() {
        System.out.println(categoryRepository.findAll());
        return categoryRepository.findAll();
    }

    // lay category theo id
    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }
    // cap nhat du lieu bang category: create / update
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    // xoa category theo id
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
