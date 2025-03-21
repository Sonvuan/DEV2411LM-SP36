package com.devmaster.lesson08_thuchanh_bai3.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "configurations")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Configuration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Boolean isActive;

    // tạo mối quan hệ với bảng Product
    @ManyToMany (mappedBy = "products")
    List<Product> products = new ArrayList<>();
}
