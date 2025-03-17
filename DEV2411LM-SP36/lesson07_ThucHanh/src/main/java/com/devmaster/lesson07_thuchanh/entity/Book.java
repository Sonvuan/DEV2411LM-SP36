package com.devmaster.lesson07_thuchanh.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Table(name = "books")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String imgUrl;
    Integer Qty;
    Double price;
    LocalDate yearReleased;
    String author;
    Boolean status;

    @ManyToOne
    @JoinColumn(name = "categoryId",nullable = false)
    Category category;

}
