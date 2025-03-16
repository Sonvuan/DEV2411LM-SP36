package com.devmaster.lesson07.service;

import com.devmaster.lesson07.entity.Product;
import com.devmaster.lesson07.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduceService {
    @Autowired
    private ProductRepository productRepository;

    // doc toan bo du lieu bang product
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    // doc du lieu bang product theo id
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    // cap nhat : ceate / update
    public Product saveProduct(Product product) {
        System.out.println(product);
        return productRepository.save(product);
    }

    // xoa product theo id
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
