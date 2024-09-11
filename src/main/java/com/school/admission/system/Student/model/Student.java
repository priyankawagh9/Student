package com.school.admission.system.Student.model;


import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
public class Student {

    private int studentId;
    private AcademicClass academicClass;
    private String firstName;
    private String lastName;
    private Branch branch;
}
