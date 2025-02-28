package com.devmaster.lesson04BaiTap.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MonHocDTO {

    @Size(max = 2, message = "Mã môn học tối đa 2 ký tự")
    String mamh;

    @Size(min = 5, max = 50, message = "Tên môn học phải nằm trong khoảng 5-50 ký tự")
    String tenmh;

    @Min(value = 45, message = "Số tiết phải tối thiểu là 45")
    @Max(value = 75, message = "Số tiết tối đa là 75")
    int sotiet;
}
