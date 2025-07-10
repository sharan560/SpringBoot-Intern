package com.example.Springbootfirstproject.Services;

import com.example.Springbootfirstproject.Models.Courses;
import com.example.Springbootfirstproject.Repository.Coursesrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    private Coursesrepo coursesrepo;
    public void addCourse(String Coursename) {
        coursesrepo.save(new Courses(Coursename));
    }

    public Courses getname(String courseName) {
        return coursesrepo.findByCourseName(courseName);
    }
}
