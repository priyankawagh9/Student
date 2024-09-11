package com.school.admission.system.Student.controller;

import com.school.admission.system.Student.model.Student;
import com.school.admission.system.Student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    private StudentController(StudentService studentService){
        this.studentService = studentService;
    }


    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
}
