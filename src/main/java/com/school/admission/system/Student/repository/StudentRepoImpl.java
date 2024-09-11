package com.school.admission.system.Student.repository;

import com.school.admission.system.Student.model.AcademicClass;
import com.school.admission.system.Student.model.Branch;
import com.school.admission.system.Student.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepoImpl implements StudentRepo{

    private List<Student> students = new ArrayList<>();

    @Override
    public List<Student> getStudents() {

        Student student1 = Student.builder()
                .studentId(1)
                .branch(Branch.GENERAL)
                .academicClass(AcademicClass.PREK)
                .firstName("Ira")
                .lastName("Vispute")
                .build();

        Student student2 = Student.builder()
                .studentId(2)
                .branch(Branch.COMPUTER_SCIENCE)
                .academicClass(AcademicClass.FOURTH_YEAR)
                .firstName("Priyanka")
                .lastName("Wagh")
                .build();

        Student student3 = Student.builder()
                .studentId(2)
                .branch(Branch.PRODUCTION)
                .academicClass(AcademicClass.FOURTH_YEAR)
                .firstName("Amit")
                .lastName("Vispute")
                .build();


        return List.of(student1, student2, student3);
    }
}
