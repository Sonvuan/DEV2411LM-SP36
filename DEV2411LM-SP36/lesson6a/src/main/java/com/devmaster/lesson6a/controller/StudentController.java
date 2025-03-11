package com.devmaster.lesson6a.controller;

import com.devmaster.lesson6a.dto.StudentDTO;
import com.devmaster.lesson6a.entity.Student;
import com.devmaster.lesson6a.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public String getStudents(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "students/student-list";
    }

    @GetMapping("/add-new")
    public String addNewStudent(Model model) {
        model.addAttribute("student", new Student());
        return "students/student-add";
    }
    @GetMapping("/edit/{id}")
    public String showFormUpdate(@PathVariable(value = "id") Long id, Model model) {
        StudentDTO student = studentService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id: " + id)); // Đổi từ IllegalAccessException sang IllegalArgumentException

        model.addAttribute("student", student);
        return "students/student-edit";
    }
    @PostMapping
    public String saveStudent(@ModelAttribute("student") StudentDTO student) {
        studentService.save(student);
        return "redirect:/students";
    }

    @PostMapping("/update/{id}")
    public String updateStudent(@PathVariable(value = "id") Long id,@ModelAttribute("student") StudentDTO student) throws IllegalAccessException {
        studentService.updateStudentById(id,student);
        return "redirect:/students" ;
    }

    @GetMapping("delete/{id}")
    public String deleteStudent(@PathVariable(value = "id") Long id) {
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }
}
