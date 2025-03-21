package com.devmaster.lesson07_thuchanh.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table (name = "categories")
@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Category {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Boolean status;
}