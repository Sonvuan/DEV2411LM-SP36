package com.devmaster.lesson09.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String code;
    String name;
    String description;
    String imgUrl;
    Integer quantity;
    Double price;
    Boolean isActive;

    @OneToMany(mappedBy = "book",cascade = CascadeType.REMOVE, orphanRemoval = true)
    List<BookAuthor> bookAuthors = new ArrayList<>();

    // Thêm phương thức getter để lấy danh sách tác giả trực tiếp
//    public List<Author> getAuthors() {
//        return bookAuthors.stream()
//                .map(BookAuthor::getAuthor)
//                .collect(Collectors.toList());
//    }
    public List<Author> getAuthors() {
        return bookAuthors.stream()
                .map(BookAuthor::getAuthor)
                .toList(); // Chỉ hỗ trợ từ Java 16
    }

}
