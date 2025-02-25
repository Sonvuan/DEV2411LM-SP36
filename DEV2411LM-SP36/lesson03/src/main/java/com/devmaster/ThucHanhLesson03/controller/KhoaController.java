package com.devmaster.ThucHanhLesson03.controller;

import com.devmaster.ThucHanhLesson03.entity.Khoa;
import com.devmaster.ThucHanhLesson03.service.KhoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KhoaController {
    @Autowired
    private KhoaService khoaService;

    /**
     * lấy danh sách khoa
     * @return danh sách khoa
     */
    @GetMapping("/khoa-list")
    public List<Khoa> getAllKhoa() {
        return khoaService.getKhoaList();
    }

    /**
     *
     * @param makh
     * @return lấy ra danh sách khoa theo mã khoa
     */
    @GetMapping("/khoa/{makh}")
    public Khoa getKhoaById(@PathVariable String makh) {
        Long makhKhoa = Long.parseLong(makh);
        return khoaService.getKhoa(makhKhoa);
    }

    /**
     * thêm Khóa
     * @param khoa
     * @return thêm Khoá
     */
    @PostMapping("/khoa-add")
    public Khoa addKhoa(@RequestBody Khoa khoa) {
        return khoaService.addKhoa(khoa);
    }

    /**
     * cập nhật theo mã khóa
     * @param makh
     * @param khoa
     * @return
     */
    @PutMapping("/khoa/{makh}")
    public Khoa updateKhoa(@PathVariable String makh, @RequestBody Khoa khoa) {
        Long makhKhoa = Long.parseLong(makh);
        return khoaService.updateKhoa(makhKhoa, khoa);
    }

    /**
     * Xóa theo mã khóa
     * @param makh
     * @return
     */
    @DeleteMapping("/khoa/{makh}")
    public boolean deleteKhoa(@PathVariable String makh) {
        return khoaService.deleteKhoa(Long.parseLong(makh));
    }
}
