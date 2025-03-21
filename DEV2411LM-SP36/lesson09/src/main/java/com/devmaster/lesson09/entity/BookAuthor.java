package com.devmaster.lesson09.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "book_author")
@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookAuthor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    Book book;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    Author author;

    Boolean isEditor;
}
