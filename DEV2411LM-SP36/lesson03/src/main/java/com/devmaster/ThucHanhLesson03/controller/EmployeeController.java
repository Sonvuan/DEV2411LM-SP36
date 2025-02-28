package com.devmaster.ThucHanhLesson03.controller;

import com.devmaster.ThucHanhLesson03.entity.Employee;
import com.devmaster.ThucHanhLesson03.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee-list")
    public List<Employee> getEmployeeList() {
        return employeeService.getEmployeeList();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable String id) {
        Long idEmployee = Long.parseLong(id);
        return employeeService.getEmployee(idEmployee);
    }

    @PostMapping("/employee-add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable String id, @RequestBody Employee employee) {
        Long idEmployee = Long.parseLong(id);
        return employeeService.updateEmployee(employee, idEmployee);
    }

    @DeleteMapping("/employee/{id}")
    public boolean deleteEmployee(@PathVariable String id) {
        Long idEmployee = Long.parseLong(id);
        return employeeService.deleteEmployee(idEmployee);
    }
}
