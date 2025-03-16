package com.devmaster.lesson6thuchanh.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private Long id;
    private String username;
    private String fullName;
    private String address;
    private int phone;
    private String email;
    private LocalDate birthDay;
    private boolean active;

}
