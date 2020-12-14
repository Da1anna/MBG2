package com.example.MBG2.controller;

import com.example.MBG2.entity.Student;
import com.example.MBG2.entity.StudentExample;
import com.example.MBG2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") Integer id){
        return studentService.selectById(id);
    }

    //查询“姓小的+大于某个年龄”的学生
    @PostMapping("")
    public List<Student> getStudentByAge(@RequestParam("age") short age){
        StudentExample example = new StudentExample();
        String first_name = "小%";
        example.or()
            .andAgeGreaterThan(age)
            .andNameLike(first_name);

        return studentService.selectByExample(example);
    }

    @GetMapping("/sub/{id}")
    public Student getStudentAndSubjects(@PathVariable("id") Integer id){
        return studentService.selectStudentAndSubjects(id);
    }

    @PostMapping("/add")
    public int insertStudent(@RequestBody Student record) {
        return studentService.insert(record);
    }

    @PostMapping("/del")
    public int deleteStudentsByName(@RequestParam("name") String name) {
        StudentExample example = new StudentExample();
        example.or().andNameEqualTo(name);
        return studentService.deleteByExample(example);
    }

    @PostMapping("/update")
    public int updateByPrimaryKeySelective(@RequestBody Student record) {
        return studentService.updateByPrimaryKeySelective(record);
    }

    @GetMapping("/all")
    public List<Student> selectAll(){
        return studentService.selectAll();
    }

}

