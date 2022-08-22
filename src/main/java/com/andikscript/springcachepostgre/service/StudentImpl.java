package com.andikscript.springcachepostgre.service;

import com.andikscript.springcachepostgre.model.Student;
import com.andikscript.springcachepostgre.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List getAllStudent() {
        return studentRepository.findAll();
    }
}
