package com.example.Springbootfirstproject.Services;

import com.example.Springbootfirstproject.Models.Courses;
import com.example.Springbootfirstproject.Models.RegDetails;
import com.example.Springbootfirstproject.Models.Student;
import com.example.Springbootfirstproject.Repository.Coursesrepo;
import com.example.Springbootfirstproject.Repository.RegRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class AuthService {

    @Autowired
    private Coursesrepo coursesrepo;
    @Autowired
    private RegRepo regRepo;
    public void registerUser(RegDetails student) {
        RegDetails s = new RegDetails();
        s.setName(student.getName());
        s.setGender(student.getGender());
        s.setPassword(student.getPassword());
        s.setEmail(student.getEmail());
        s.setDept(student.getDept());
        s.setRole(student.getRole());

        Set<Courses> validCourses = new HashSet<>();
        System.out.println(student.getCourses());
        for (Courses cour : student.getCourses()) {
            Courses dbCourse = coursesrepo.findByCourseName(cour.getCourseName());
            System.out.println(dbCourse);
            if (dbCourse != null) {

                validCourses.add(dbCourse); // Add existing course object
            }
        }

        s.setCourses(validCourses);

        regRepo.save(s);
    }

}
