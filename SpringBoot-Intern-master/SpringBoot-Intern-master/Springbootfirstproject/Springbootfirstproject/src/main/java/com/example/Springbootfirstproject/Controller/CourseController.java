package com.example.Springbootfirstproject.Controller;

import com.example.Springbootfirstproject.Models.Courses;
import com.example.Springbootfirstproject.Services.CourseService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @PostMapping("/addcourse")
    public String addcourse(@RequestParam String courseName) {
        courseService.addCourse(courseName);
        return "addcourse";
    }
    @GetMapping("/getCourse")
    public Courses getCourse(@RequestParam String courseName) {
        return courseService.getname(courseName);
    }
}
