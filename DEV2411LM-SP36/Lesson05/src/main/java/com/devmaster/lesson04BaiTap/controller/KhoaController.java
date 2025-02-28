package com.devmaster.lesson04BaiTap.controller;


import com.devmaster.lesson04BaiTap.dto.KhoaDTO;
import com.devmaster.lesson04BaiTap.entity.Khoa;
import com.devmaster.lesson04BaiTap.service.KhoaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/khoa")
public class KhoaController {

    @Autowired
    private KhoaService khoaService;

    @GetMapping("/list")
    public List<Khoa> getAllKhoa() {
        return khoaService.AllKhoaList();
    }


    @GetMapping("/{makh}")
    public ResponseEntity<?> checkKhoaExists(@PathVariable String makh) {
        Optional<Khoa> khoa = khoaService.getKhoaById(makh);
            return new ResponseEntity<>(khoa, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addKhoa(@Valid @RequestBody KhoaDTO khoaDTO) {
        khoaService.create(khoaDTO);
        return ResponseEntity.ok("Khoa created successfully!");
    }

    @PutMapping("/update/{makh}")
    public ResponseEntity<String> updateKhoa(@Valid @PathVariable String makh, @RequestBody KhoaDTO khoaDTO ) {
        khoaService.updateKhoa(makh, khoaDTO);
        return ResponseEntity.ok("Khoa updated successfully!");
    }

    @DeleteMapping("/delete/{makh}")
    public ResponseEntity<String> deleteKhoa(@PathVariable String makh) {
        khoaService.deleteKhoa(makh);
        return ResponseEntity.ok("Khoa deleted successfully!");
    }

}
