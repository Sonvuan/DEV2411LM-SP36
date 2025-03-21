package com.devmaster.lesson09.repository;

import com.devmaster.lesson09.entity.BookAuthor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookAuthorRepository extends JpaRepository<BookAuthor, Long> {

}
