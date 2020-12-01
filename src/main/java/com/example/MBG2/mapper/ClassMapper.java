package com.example.MBG2.mapper;

import com.example.MBG2.entity.Class;
import com.example.MBG2.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassMapper {
    int insert(Class record);

    int insertSelective(Class record);

    Class getClassAndStudents(Byte id);
}