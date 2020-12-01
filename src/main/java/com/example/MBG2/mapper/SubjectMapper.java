package com.example.MBG2.mapper;

import com.example.MBG2.entity.Subject;

public interface SubjectMapper {
    int insert(Subject record);

    int insertSelective(Subject record);
}