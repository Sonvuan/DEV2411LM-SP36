package com.devmaster.lesson6thuchanh.repository;

import com.devmaster.lesson6thuchanh.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
