package com.devmaster.lesson04BaiTap.service;


import com.devmaster.lesson04BaiTap.dto.MonHocDTO;
import com.devmaster.lesson04BaiTap.entity.MonHoc;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class MonHocService {
    List<MonHoc> monHocs = new ArrayList<MonHoc>();
    public MonHocService() {
        monHocs.addAll(
                Arrays.asList(
                        new MonHoc("1b","Toán rời rạc",30),
                        new MonHoc("2b","Toán cao cấp",30),
                        new MonHoc("3b","Kiến trúc phần mềm",30),
                        new MonHoc("4b","Xử lí ảnh",30),
                        new MonHoc("5b","Triết học",30)
                )
        );
    }

    public List<MonHoc> getMonHocs() {
        return monHocs;
    }

    public Optional<MonHoc> getMonHocById(String mamh) {
        return monHocs.stream().filter(monHoc -> monHoc.getMamh().equals(mamh)).findFirst();
    }

    public boolean create(MonHocDTO monHocDTO) {
        try {
            MonHoc monHoc = MonHoc.builder()
                    .mamh(monHocDTO.getMamh())
                    .tenmh(monHocDTO.getTenmh())
                    .sotiet(monHocDTO.getSotiet())
                    .build();
            monHocs.add(monHoc);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public MonHoc update(String mamh ,MonHocDTO monHocDTO) {
        MonHoc monhoc = getMonHocById(mamh)
                .orElseThrow(() -> new RuntimeException("Monhoc not found"));
        monhoc.setTenmh(monHocDTO.getTenmh());
        monhoc.setSotiet(monHocDTO.getSotiet());
        return monhoc;
    }

    public boolean delete(String mamh) {
        MonHoc monhoc = getMonHocById(mamh).orElseThrow(() -> new RuntimeException("Monhoc not found"));
        monHocs.remove(monhoc);
        return true;
    }
}
