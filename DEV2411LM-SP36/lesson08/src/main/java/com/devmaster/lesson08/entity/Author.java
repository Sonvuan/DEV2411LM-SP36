package com.devmaster.lesson08.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String code;
    String name;
    String description;
    String imgUrl;
    String email;
    String phone;
    String address;
    Boolean isActive;

    // tạo mối quan hệ với bảng book
    @ManyToMany(mappedBy = "authors")
    List<Book> books = new ArrayList<>();
}
