package com.devmaster.lesson04BaiTap.service;


import com.devmaster.lesson04BaiTap.dto.KhoaDTO;
import com.devmaster.lesson04BaiTap.entity.Khoa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class KhoaService {
    List<Khoa> khoaList = new ArrayList<Khoa>();
        public KhoaService() {
            khoaList.addAll(
                    Arrays.asList(
                            new Khoa("1a","Công Nghệ Thông Tin"),
                            new Khoa("2a","Công Nghệ Du Lịch"),
                            new Khoa("3a","Quản Trị Thông Tin"),
                            new Khoa("4a","Quản Trị Kinh Doanh"),
                            new Khoa("5a","Kế Toán")
                    )
            );
        }
    public List<Khoa> AllKhoaList() {
            return khoaList;
    }

    public Optional<Khoa> getKhoaById(String makh) {
        return khoaList.stream()
                .filter(k -> k.getMakh().equals(makh))
                .findFirst();
    }



    public Boolean create(KhoaDTO khoaDTO) {
            try {
                Khoa khoa = Khoa.builder()
                        .makh(khoaDTO.getMakh())
                        .tenkh(khoaDTO.getTenkh())
                        .build();
                khoaList.add(khoa);
                return true;
            }catch (Exception e){
                return false;
            }
    }

    public Khoa updateKhoa(String makh, KhoaDTO khoaDTO) {
        Khoa khoa = getKhoaById(makh)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy Khoa với ID: " + makh));

        khoa.setTenkh(khoaDTO.getTenkh());  // Cập nhật thông tin
        return khoa;  // Trả về Khoa đã cập nhật
    }

    public boolean deleteKhoa(String makh) {
        Khoa khoa = getKhoaById(makh)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy Khoa với ID: " + makh));
        khoaList.remove(khoa);
        return true;
    }

}
