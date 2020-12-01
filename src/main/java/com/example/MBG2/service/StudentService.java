package com.example.MBG2.service;

import com.example.MBG2.entity.Student;
import com.example.MBG2.entity.StudentExample;

import java.util.List;

public interface StudentService {

    Student selectById(Integer id);

    List<Student> selectByExample(StudentExample example);

    Student selectStudentAndSubjects(Integer id);
}
