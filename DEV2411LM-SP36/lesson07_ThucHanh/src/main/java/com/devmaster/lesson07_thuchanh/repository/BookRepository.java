package com.devmaster.lesson07_thuchanh.repository;

import com.devmaster.lesson07_thuchanh.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
