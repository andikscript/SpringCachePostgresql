package com.andikscript.springcachepostgre.service;

import com.andikscript.springcachepostgre.model.Student;

import java.util.List;

public interface StudentService {

    void addStudent(Student student);

    List getAllStudent();
}
