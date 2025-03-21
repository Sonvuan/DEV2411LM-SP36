package com.devmaster.lesson09.service;

import com.devmaster.lesson09.entity.Author;
import com.devmaster.lesson09.entity.Book;
import com.devmaster.lesson09.entity.BookAuthor;
import com.devmaster.lesson09.repository.AuthorRepository;
import com.devmaster.lesson09.repository.BookAuthorRepository;
import com.devmaster.lesson09.repository.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookAuthorRepository bookAuthorRepository;

    // lấy toàn bộ book
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // lấy ra 1 book theo id
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    // ghi lại những thay đổi
    @Transactional
    public void saveBookWithAuthors(Book book, List<Long> authorIds, Long editorId) {
        bookRepository.save(book); // Lưu sách trước để có ID

        if (authorIds != null) {
            for (Long authorId : authorIds) {
                Author author = authorRepository.findById(authorId).orElseThrow();
                boolean isEditor = (editorId != null && editorId.equals(authorId)); // Kiểm tra nếu là chủ biên
                bookAuthorRepository.save(new BookAuthor(null, book, author, isEditor));
            }
        }
    }

    // xóa book theo id
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }
}
