package com.devmaster.lesson04BaiTap.controller;


import com.devmaster.lesson04BaiTap.dto.EmployeeDTO;
import com.devmaster.lesson04BaiTap.entity.Employee;
import com.devmaster.lesson04BaiTap.service.EmployeeService;
import com.devmaster.lesson04BaiTap.service.KhoaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/list")
    public List<Employee> list() {
        return employeeService.getEmployees();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable String id) {
        Long employeeId = Long.parseLong(id);
        Optional<Employee>employee = employeeService.getEmployeeById(employeeId);
        employeeService.getEmployeeById(employeeId);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<String> add(@Valid @RequestBody EmployeeDTO employeeDTO) {
        employeeService.addEmployee(employeeDTO);
        return ResponseEntity.ok("Employee added successfully");
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@PathVariable String id, @Valid @RequestBody EmployeeDTO employeeDTO) {
        Long employeeId = Long.parseLong(id);
        employeeService.updateEmployee(employeeId, employeeDTO);
        return ResponseEntity.ok("Employee updated successfully");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {
        Long employeeId = Long.parseLong(id);
        employeeService.deleteEmployee(employeeId);
        return ResponseEntity.ok("Employee deleted successfully");
    }


}
