package com.andikscript.springcachepostgre.service;

import com.andikscript.springcachepostgre.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImpl implements StudentService {

    private final StudentService studentService;

    public StudentImpl(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void addStudent(Student student) {
        studentService.addStudent(student);
    }

    @Override
    public List getAllStudent() {
        return studentService.getAllStudent();
    }
}
