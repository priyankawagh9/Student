package com.school.admission.system.Student.repository;

import com.school.admission.system.Student.model.Student;

import java.util.List;

public interface StudentRepo {
    List<Student> getStudents();
}
