package com.andikscript.springcachepostgre.service;

import com.andikscript.springcachepostgre.model.Student;
import com.andikscript.springcachepostgre.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

    @Override
    public Student getStudentById(UUID id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void updateStudent(UUID id, Student student) {
        student.setId(id);
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(UUID id) {
        studentRepository.deleteById(id);
    }
}
