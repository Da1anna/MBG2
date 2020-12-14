package com.example.MBG2.service;

import com.example.MBG2.entity.Student;
import com.example.MBG2.entity.StudentExample;

import java.util.List;

public interface StudentService {

    //根据id查找
    Student selectById(Integer id);

    //根据条件查看
    List<Student> selectByExample(StudentExample example);

    //根据id查找学生及其选课
    Student selectStudentAndSubjects(Integer id);

    //插入学生信息
    int insert(Student record);

    //根据条件删除
    int deleteByExample(StudentExample example);

    //根据id更新
    int updateByPrimaryKeySelective(Student record);

    //获取all
    List<Student> selectAll();

}
