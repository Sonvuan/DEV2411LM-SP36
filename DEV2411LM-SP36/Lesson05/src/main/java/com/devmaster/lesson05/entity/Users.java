package com.devmaster.lesson05.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Users {
    Long id;
    String username;
    String password;
    String fullName;
    LocalDate birthDate;
    String email;
    String phone;
    int age;
    Boolean status;
}
