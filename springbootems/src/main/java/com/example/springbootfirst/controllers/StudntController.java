package com.example.springbootfirst.controllers;

import com.example.springbootfirst.models.Student;
import com.example.springbootfirst.services.Studentseivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class StudntController {

    @Autowired
    private Studentseivice studentseivice;
    @PostMapping("/addstudent")
    public void addstudent(@RequestBody Student student){
        studentseivice.add(student)
    }
    @GetMapping("getstudnet")
    public List<Studentseivice> getstudnet(@RequestBody Student student){
        return studentseivice.getall(student);
    }
}
