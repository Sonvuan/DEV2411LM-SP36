package com.devmaster.lesson07_thuchanh.service;


import com.devmaster.lesson07_thuchanh.entity.Book;
import com.devmaster.lesson07_thuchanh.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    // hiển thị danh sách book
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // hien thị Book theo id
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    // cập nhật book
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
    // xóa book theo id
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }
}
