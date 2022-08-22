package com.andikscript.springcachepostgre.repository;

import com.andikscript.springcachepostgre.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
}
