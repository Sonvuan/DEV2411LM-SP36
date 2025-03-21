package com.devmaster.lesson08.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.*;

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

    // Tạo mối quan hệ với bảng author
    @ManyToMany
    @JoinTable(
            name = "Book_Author", // tên bảng trung gian
            joinColumns = @JoinColumn(name ="bookId"), // khóa chính của book
            inverseJoinColumns = @JoinColumn(name = "authorId") // khóa chính của author
            
    )
     List<Author> authors = new ArrayList<>();
}
