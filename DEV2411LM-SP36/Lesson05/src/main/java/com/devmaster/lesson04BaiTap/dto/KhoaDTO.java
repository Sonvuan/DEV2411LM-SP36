package com.devmaster.lesson04BaiTap.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class KhoaDTO {
    @NotBlank(message = "Không được để trống")
    @Size(min = 2, message = "Mã khoa tối thiểu 2 kí tự")
    String makh;

    @Size(min = 5, max = 25, message = "Tên khoa phải nằm trong khoảng 5-25 kí tự")
    String tenkh;
}
