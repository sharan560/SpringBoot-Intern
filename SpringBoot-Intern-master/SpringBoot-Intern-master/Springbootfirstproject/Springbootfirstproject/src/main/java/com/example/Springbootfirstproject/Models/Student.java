package com.example.Springbootfirstproject.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Student {

    private int rollno;
    private String name;
    private String dept;
    private String email;
    private String password;
    private String gender;
    private String Courses;

}
