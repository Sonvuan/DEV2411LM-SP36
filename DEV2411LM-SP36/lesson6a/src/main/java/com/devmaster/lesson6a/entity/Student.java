package com.devmaster.lesson6a.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "students")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "age")
    private int age;
}
