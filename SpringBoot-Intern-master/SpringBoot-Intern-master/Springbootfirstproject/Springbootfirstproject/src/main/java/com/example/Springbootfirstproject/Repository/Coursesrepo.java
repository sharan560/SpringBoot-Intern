package com.example.Springbootfirstproject.Repository;

import com.example.Springbootfirstproject.Models.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Coursesrepo extends JpaRepository<Courses, Integer> {



    Courses findByCourseName(String courseName);
}
