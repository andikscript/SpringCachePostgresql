package com.andikscript.springcachepostgre.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "id_student", nullable = false)
    @GeneratedValue
    private UUID id;

    @Column(name = "name", nullable = false, length = 512)
    private String name;

    @Column(name = "grade", nullable = false)
    private Integer grade;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

}