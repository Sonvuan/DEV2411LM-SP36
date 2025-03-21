package com.devmaster.lesson08_thuchanh_bai3.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "products")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String imgUrl;
    Integer quantity;
    Double price;
    Boolean isActive;

    // tạo mối quan hệ với bảng Configuration
    @ManyToMany
    @JoinTable(
            name = "Product_Config",
            joinColumns = @JoinColumn(name = "productId"),
            inverseJoinColumns = @JoinColumn(name = "configId")
    )
    List<Configuration> configurations = new ArrayList<>();
}
