package com.devmaster.lesson09.service;

import com.devmaster.lesson09.entity.Author;
import com.devmaster.lesson09.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> findAll() {
        return authorRepository.findAll();
    }
    public Author findById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }
    public Author save(Author author) {
        return authorRepository.save(author);
    }

    // lẤy ra những tác giả được chọn
    public List<Author> findAllById(List<Long> ids) {
        return authorRepository.findAllById(ids);
    }
    public void delete(Long id) {
        authorRepository.deleteById(id);
    }
}
