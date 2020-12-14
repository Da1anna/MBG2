package com.example.MBG2.service.impl;

import com.example.MBG2.entity.Student;
import com.example.MBG2.entity.StudentExample;
import com.example.MBG2.mapper.StudentMapper;
import com.example.MBG2.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student selectById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Student> selectByExample(StudentExample example) {
        return studentMapper.selectByExample(example);
    }

    @Override
    public Student selectStudentAndSubjects(Integer id) {
        return studentMapper.selectStudentAndSubjects(id);
    }

    @Override
    public int insert(Student record) {
        return studentMapper.insert(record);
    }

    @Override
    public int deleteByExample(StudentExample example) {
        return studentMapper.deleteByExample(example);
    }

    @Override
    public int updateByPrimaryKeySelective(Student record) {
        return studentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }
}
