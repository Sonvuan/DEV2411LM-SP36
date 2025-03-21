package com.devmaster.lesson08_thuchanh_bai3.repository;

import com.devmaster.lesson08_thuchanh_bai3.entity.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigurationRepository extends JpaRepository<Configuration, Long> {
}
