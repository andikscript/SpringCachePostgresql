package com.andikscript.springcachepostgre.service;

import com.andikscript.springcachepostgre.model.Student;
import com.andikscript.springcachepostgre.repository.StudentRepository;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@CacheConfig(cacheNames = "studentCache")
public class StudentImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Cacheable(value = "student", key = "#root.method.name")
    @Override
    public List getAllStudent() {
        return studentRepository.findAll();
    }

    @Cacheable(value = "student", key = "#id")
    @Override
    public Student getStudentById(UUID id) {
        return studentRepository.findById(id).get();
    }

    @CachePut(value = "student", key = "#id")
    @Override
    public Student updateStudent(UUID id, Student student) {
        student.setId(id);
        return studentRepository.save(student);
    }

    @CacheEvict(value = "student", allEntries = true)
    @Override
    public void deleteStudent(UUID id) {
        studentRepository.deleteById(id);
    }
}
