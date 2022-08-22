package com.andikscript.springcachepostgre.controller;

import com.andikscript.springcachepostgre.model.Student;
import com.andikscript.springcachepostgre.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/all")
    public ResponseEntity<?> getAllStudent() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(studentService.getAllStudent());
    }

    @PostMapping(value = "/add")
    public ResponseEntity<?> addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("created");
    }
}
