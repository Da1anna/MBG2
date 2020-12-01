package com.example.MBG2.service.impl;

import com.example.MBG2.entity.Class;
import com.example.MBG2.mapper.ClassMapper;
import com.example.MBG2.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private ClassMapper classMapper;

    @Override
    public Class getClassAndStudents(Byte id) {
        return classMapper.getClassAndStudents(id);
    }
}
