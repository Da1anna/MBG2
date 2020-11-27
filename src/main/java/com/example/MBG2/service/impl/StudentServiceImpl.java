package com.example.MBG2.service.impl;

import com.example.MBG2.entity.Student;
import com.example.MBG2.mapper.StudentMapper;
import com.example.MBG2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student selectById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
