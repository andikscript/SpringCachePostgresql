package com.andikscript.springcachepostgre.service;

import com.andikscript.springcachepostgre.model.Student;

import java.util.List;
import java.util.UUID;

public interface StudentService {

    void addStudent(Student student);

    List getAllStudent();

    Student getStudentById(UUID id);

    void updateStudent(UUID id, Student student);

    void deleteStudent(UUID id);
}
