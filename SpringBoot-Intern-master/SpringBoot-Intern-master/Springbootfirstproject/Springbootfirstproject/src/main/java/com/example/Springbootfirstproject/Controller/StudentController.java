package com.example.Springbootfirstproject.Controller;

import com.example.Springbootfirstproject.Models.RegDetails;
import com.example.Springbootfirstproject.Models.Student;
import com.example.Springbootfirstproject.Services.StudentService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @GetMapping("/all")
    public List<RegDetails> all() {
        return studentService.getall();

    }

}
