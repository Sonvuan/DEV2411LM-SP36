package com.devmaster.ThucHanhLesson03.service;

import com.devmaster.ThucHanhLesson03.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> employeeList = new ArrayList<Employee>();
    public EmployeeService() {
        employeeList.addAll(
                Arrays.asList(
                        new Employee(1l,"An Vũ Sơn","nam",20,100000),
                        new Employee(2l,"An Vũ Sơn A","nữ",21,100000),
                        new Employee(3l,"An Vũ Sơn B","nam",23,100000),
                        new Employee(4l,"An Vũ Sơn C","nữ",27,100000),
                        new Employee(5l,"An Vũ Sơn D","nam",20,100000)
                )

        );
    }

    // lấy danh sách Giáo viên
    public List<Employee> getEmployeeList() {
        return employeeList;
    }
    // lấy danh sách theo id
    public Employee getEmployee(Long id) {
        return employeeList.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst().orElse(null);
    }
    // thêm giáo viên
    public Employee addEmployee(Employee employee) {
        employeeList.add(employee);
        return employee;
    }

    // sửa thông tin theo id

    public Employee updateEmployee(Employee employee, Long id) {
        Employee check = getEmployee(id);
        if(check != null){
            return employee;
        }
        employeeList.forEach( item ->
                {
                    if(employee.getId() == id){
                        item.setId(employee.getId());
                        item.setFullName(employee.getFullName());
                        item.setGender(employee.getGender());
                        item.setAge(employee.getAge());
                        item.setSalary(employee.getSalary());
        }
                }
        );
        return employee;
    }

    // xóa thông tin giáo viên
    public boolean deleteEmployee(Long id) {
        Employee check = getEmployee(id);
        return employeeList.remove(check);
    }
}
