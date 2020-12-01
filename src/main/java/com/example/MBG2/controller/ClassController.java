package com.example.MBG2.controller;

import com.example.MBG2.entity.Class;
import com.example.MBG2.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/class")
public class ClassController {

    @Autowired
    private ClassService classService;

    @GetMapping("/{id}")
    public Class getClassAndStudents(@PathVariable("id") Byte id){
        return classService.getClassAndStudents(id);
    }
}
