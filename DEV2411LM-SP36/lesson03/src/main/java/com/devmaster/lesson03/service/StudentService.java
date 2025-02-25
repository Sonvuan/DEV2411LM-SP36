package com.devmaster.lesson03.service;

import com.devmaster.lesson03.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Service class : StudentService
 * <p>Lớp dịch vụ thực hiện các chức năng thao tác với List Oject Student</p>
 * @author An Vũ Sơn
 * @version 1.0
 */
@Service
public class StudentService {
    // mock data
    List<Student> students = new ArrayList<Student>();
        public StudentService() {
            students.addAll(
                    Arrays.asList(
                            new Student(1L,"devmaster",20,"none","Số 25 vũ ngọc phan","0978061276","son9xhy12345@gmail.com"),
                                new Student(2L,"devmaster",20,"none","Số 25 vũ ngọc phan","0978061276","son9xhy12345@gmail.com")
                    )
            );
        }
    // lấy toàn bộ danh sách sinh viên
    public List<Student> getStudents() {
            return students;
    }
    // lấy sinh viên theo id
    public Student getStudent(Long id) {
            return students.stream().filter(student -> student.getId().equals(id)).findFirst().orElse(null);
    }
    // thêm mới sinh viên
    public Student addStudent(Student student) {
            students.add(student);
            return student;
    }
    // cập nhật thông tin sinh viên
    public Student updateStudent(Long id, Student student) {
            Student check = getStudent(id);
        if(check != null) {
            return null;
        }
        students.forEach(item -> {
            if(item.getId()==(id)) {
                item.setName(student.getName());
                item.setAge(student.getAge());
                item.setEmail(student.getEmail());
                item.setPhone(student.getPhone());
                item.setAddress(student.getAddress());
                item.setGender(student.getGender());
            }
        });
        return student;
    }
    // xóa thông tin sinh viên
    public boolean deleteStudent(Long id) {
            Student student= getStudent(id);
            return students.remove(student);

    }
}
