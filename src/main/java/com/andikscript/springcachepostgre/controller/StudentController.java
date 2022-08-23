package com.andikscript.springcachepostgre.controller;

import com.andikscript.springcachepostgre.model.Student;
import com.andikscript.springcachepostgre.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

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

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable(value = "id") UUID id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(studentService.getStudentById(id));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<?> updateStudent(@PathVariable(value = "id") UUID id, @RequestBody Student student) {
        studentService.updateStudent(id, student);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("update");
    }
}
