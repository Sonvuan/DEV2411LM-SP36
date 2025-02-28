package com.devmaster.lesson04BaiTap.controller;


import com.devmaster.lesson04BaiTap.dto.MonHocDTO;
import com.devmaster.lesson04BaiTap.entity.MonHoc;
import com.devmaster.lesson04BaiTap.service.MonHocService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/monhoc")
public class MonHocController {
    @Autowired
    private MonHocService monHocService;

    @GetMapping("/list")
    public List<MonHoc> getAllMonHoc() {
        return monHocService.getMonHocs();
    }

    @GetMapping("/{mamh}")
    public ResponseEntity<?> getMonHocById(@PathVariable String mamh) {
        Optional<MonHoc> monHoc = monHocService.getMonHocById(mamh);
        return new ResponseEntity<>(monHoc.get(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addMonHoc(@Valid @RequestBody MonHocDTO monHocDTO) {
        monHocService.create(monHocDTO);
        return ResponseEntity.ok("The monhoc added successfully");
    }

    @PutMapping("/update/{mamh}")
    public ResponseEntity<String> updateById(@PathVariable String mamh, @Valid @RequestBody MonHocDTO monHocDTO) {
        monHocService.update(mamh, monHocDTO);
        return ResponseEntity.ok("The monhoc updated successfully");
    }

    @DeleteMapping("/delete/{mamh}")
    public ResponseEntity<String> deleteById(@PathVariable String mamh) {
        monHocService.delete(mamh);
        return ResponseEntity.ok("The monhoc deleted successfully");
    }
}
