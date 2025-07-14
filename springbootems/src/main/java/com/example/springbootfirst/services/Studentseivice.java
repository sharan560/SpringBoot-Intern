package com.example.springbootfirst.services;

import com.example.springbootfirst.models.Student;
import com.example.springbootfirst.repository.Studnetrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Studentseivice {

    @Autowired
    private Studnetrepo studnetrepo;
    public void add(Student student) {
        studnetrepo.save(student)
    }

    public List<Studentseivice> getall(Student student) {
        return studnetrepo.findAll();
    }
}
