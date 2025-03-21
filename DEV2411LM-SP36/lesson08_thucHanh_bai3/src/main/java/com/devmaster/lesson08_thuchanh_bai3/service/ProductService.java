package com.devmaster.lesson08_thuchanh_bai3.service;

import com.devmaster.lesson08_thuchanh_bai3.entity.Product;
import com.devmaster.lesson08_thuchanh_bai3.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
    public Product save(Product product) {
        return productRepository.save(product);
    }
    
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
