package com.devmaster.lesson08.service;

import com.devmaster.lesson08.entity.Book;
import com.devmaster.lesson08.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    // lấy toàn bộ book
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // lấy ra 1 book theo id
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    // ghi lại những thay đổi
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    // xóa book theo id
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }
}
