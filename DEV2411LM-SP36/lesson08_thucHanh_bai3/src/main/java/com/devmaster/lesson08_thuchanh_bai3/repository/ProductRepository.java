package com.devmaster.lesson08_thuchanh_bai3.repository;

import com.devmaster.lesson08_thuchanh_bai3.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
