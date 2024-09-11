package com.school.admission.system.Student.service;

import com.school.admission.system.Student.model.Student;
import com.school.admission.system.Student.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private final StudentRepo studentRepo;

    @Autowired
    private StudentServiceImpl(StudentRepo studentRepo){
        this.studentRepo = studentRepo;
    }

    @Override
    public List<Student> getStudents() {
        return studentRepo.getStudents();
    }
}
