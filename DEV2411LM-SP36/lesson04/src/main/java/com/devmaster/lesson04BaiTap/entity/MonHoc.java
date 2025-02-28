package com.devmaster.lesson04BaiTap.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MonHoc {
    String mamh;
    String tenmh;
    int sotiet;
}
