package com.devmaster.ThucHanhLesson03.controller;

import com.devmaster.ThucHanhLesson03.entity.MonHoc;
import com.devmaster.ThucHanhLesson03.service.MonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MonHocController {
    @Autowired
    private MonHocService monHocService;

    /**
     * lấy danh sách Môn Học
     * @return
     */
    @GetMapping("/monhoc-list")
    public List<MonHoc> getAllMonHoc() {
        return monHocService.getMonHocList();
    }

    /**
     * Lấy danh sách môn học theo mã môn học
     * @param mamh
     * @return
     */
    @GetMapping("/monhoc/{mamh}")
    public MonHoc getMonHocById(@PathVariable String mamh) {
        Long mamhId = Long.parseLong(mamh);
        return monHocService.getMonHocById(mamhId);
    }

    /**
     * Thêm môn học
     * @param monHoc
     * @return
     */
    @PostMapping("/monhoc-add")
    public MonHoc addMonHoc(@RequestBody MonHoc monHoc) {
        return monHocService.addMonHoc(monHoc);
    }

    /**
     * sửa môn học theo mã môn học
     * @param mamh
     * @param monHoc
     * @return
     */
    @PutMapping("/monhoc/{mamh}")
    public MonHoc updateMonHoc(@PathVariable String mamh, @RequestBody MonHoc monHoc) {
        Long mamhMonHoc = Long.parseLong(mamh);
        return monHocService.updateMonHoc(mamhMonHoc,monHoc);
    }

    /**
     * xóa môn học theo mã môn học
     * @param mamh
     * @return
     */
    @DeleteMapping("/monhoc/{mamh}")
    public boolean deleteMonHoc(@PathVariable String mamh) {
        Long mamhMonHoc = Long.parseLong(mamh);
        return monHocService.deleteMonHoc(mamhMonHoc);
    }
}
