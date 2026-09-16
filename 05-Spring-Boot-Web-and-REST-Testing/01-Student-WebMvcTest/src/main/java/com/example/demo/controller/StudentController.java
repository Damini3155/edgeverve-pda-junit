package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stusent")
public class StudentController {
    public Student getStudent(@PathVariable int id)
    {
        return  new Student(id,"Damini","java");
    }

    public Student saveStudent(@RequestBody Student student)
    {
        return   student;
    }
}
