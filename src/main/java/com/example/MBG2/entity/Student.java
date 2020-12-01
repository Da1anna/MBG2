package com.example.MBG2.entity;

import java.util.List;

public class Student {
    private Integer id;

    private String name;

    private Short age;

    //添加
    private List<Subject> student_subjects;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }


    public List<Subject> getStudent_subjects() {
        return student_subjects;
    }

    public void setStudent_subjects(List<Subject> student_subjects) {
        this.student_subjects = student_subjects;
    }
}