package com.devmaster.lesson04BaiTap.dto;


import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeDTO {


    Long id;

    @Size(min = 3, max = 25, message = "Tên phải có từ 3 đến 25 ký tự")
    @NotBlank(message = "Tên không được để trống")
    String fullName;

    @Min(value = 18, message = "Tuổi phải từ 18 trở lên")
    @Max(value = 60, message = "Tuổi không được quá 60")
    int age;

    @Positive(message = "Lương phải lớn hơn 0")
    float salary;
}
