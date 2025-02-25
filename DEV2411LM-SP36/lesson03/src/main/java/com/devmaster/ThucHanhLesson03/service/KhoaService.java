package com.devmaster.ThucHanhLesson03.service;

import com.devmaster.ThucHanhLesson03.entity.Khoa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class KhoaService {
    List<Khoa> khoaList = new ArrayList<Khoa>();
    public KhoaService() {
        khoaList.addAll(
                Arrays.asList(
                        new Khoa(1L,"CNTT"),
                        new Khoa(2L,"QTKD"),
                        new Khoa(3L,"QTDL"),
                        new Khoa(4L,"KETOAN"),
                        new Khoa(5L,"QLDD")
                )
        );
    }

    // lay toan bo danh sach
    public List<Khoa> getKhoaList() {
        return khoaList;
    }
    // lay danh sach theo makh
    public  Khoa getKhoa(Long makh) {
        return khoaList.stream()
                .filter(khoa -> khoa.getMaKh()
                .equals(makh)).findFirst()
                .orElse(null);
    }
    // them moi 1 khoa
    public Khoa addKhoa(Khoa khoa) {
        khoaList.add(khoa);
        return khoa;
    }
    // sua theo ma khoa
    public Khoa updateKhoa(Long makh, Khoa khoa) {
        Khoa check = getKhoa(makh);
        if(check != null) {
            return null;
        }
        khoaList.forEach(item
                -> {
                        if(item.getMaKh() == makh) {
                        item.setMaKh(khoa.getMaKh());
                        item.setTenkh(khoa.getTenkh());
                        }
                    }
                );
        return khoa;
    }
    // xoa thong tin theo ma khoa
    public boolean deleteKhoa(Long makh) {
        Khoa check = getKhoa(makh);
        return khoaList.remove(check);
    }
}
