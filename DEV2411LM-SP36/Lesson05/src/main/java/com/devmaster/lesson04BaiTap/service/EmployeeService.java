package com.devmaster.lesson04BaiTap.service;

import com.devmaster.lesson04BaiTap.dto.EmployeeDTO;
import com.devmaster.lesson04BaiTap.entity.Employee;
import com.devmaster.lesson04BaiTap.entity.Khoa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    List<Employee> employees = new ArrayList<Employee>();
    public EmployeeService() {
        employees.addAll(
                Arrays.asList(
                        new Employee(1l,"An Vũ Sơn",20,10000),
                        new Employee(2l,"An Vũ Tiến",24,10000),
                        new Employee(3l,"An Vũ Trang",27,10000),
                        new Employee(4l,"An Vũ Chung",29,10000),
                        new Employee(5l,"An Vũ Quân",50,10000)
                )
        );
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employees.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst();
    }


    public boolean addEmployee(EmployeeDTO employeeDTO) {
        try {
            Employee employee = Employee.builder()
                    .id((long) employees.size() + 1)
                    .fullName(employeeDTO.getFullName())
                    .salary(employeeDTO.getSalary())
                    .build();
            employees.add(employee);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public Employee updateEmployee(Long id ,EmployeeDTO employeeDTO) {
        Employee employee = getEmployeeById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy Employee với ID: " + id));

        employee.setFullName(employeeDTO.getFullName());
        employee.setAge(employeeDTO.getAge());
        employee.setSalary(employeeDTO.getSalary());
        return employee;
    }

    public boolean deleteEmployee(Long id) {
        Employee employee = getEmployeeById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy Employee với ID: " + id));

        employees.remove(employee);
        return true;
    }
}
