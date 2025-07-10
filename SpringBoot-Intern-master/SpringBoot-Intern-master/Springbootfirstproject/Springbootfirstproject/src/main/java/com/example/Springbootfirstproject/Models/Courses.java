package com.example.Springbootfirstproject.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "courses")
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String courseName;

    @ManyToMany(mappedBy = "courses")
    private Set<RegDetails> regDetails = new HashSet<>();


    public Courses(String coursename) {
        this.courseName = coursename;
    }
}
