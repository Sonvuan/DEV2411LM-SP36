package com.devmaster.lesson6a.service;

import com.devmaster.lesson6a.dto.StudentDTO;
import com.devmaster.lesson6a.entity.Student;
import com.devmaster.lesson6a.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    // hiển thị danh sách người dùng

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    // hiển thị danh sách người dùng theo id

    public Optional<StudentDTO> findById(Long id) {
        Student student = studentRepository.findById(id).orElse(null);
        StudentDTO studentDTO = StudentDTO.builder()
                .id(student.getId())
                .name(student.getName())
                .email(student.getEmail())
                .age(student.getAge())
                .build();
        return Optional.of(studentDTO);
    }

    public Boolean save(StudentDTO studentDTO) {
        Student student = Student.builder()
                .name(studentDTO.getName())
                .email(studentDTO.getEmail())
                .age(studentDTO.getAge())
                .build();
        try{
            studentRepository.save(student);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    // sửa sinh viên

    public Student updateStudentById(Long id, StudentDTO updatedStudentDTO) throws IllegalAccessException {
        return studentRepository.findById(id)
                .map(student ->{
                    student.setName(updatedStudentDTO.getName());
                    student.setEmail(updatedStudentDTO.getEmail());
                    student.setAge(updatedStudentDTO.getAge());
                    return studentRepository.save(student);
                })
                .orElseThrow(()-> new IllegalAccessException("Invalid student Id: " +id));

    }

    // xóa
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

}
