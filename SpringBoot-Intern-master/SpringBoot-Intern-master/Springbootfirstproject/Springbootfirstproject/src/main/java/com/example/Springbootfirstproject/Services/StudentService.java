package com.example.Springbootfirstproject.Services;

import com.example.Springbootfirstproject.Models.RegDetails;
import com.example.Springbootfirstproject.Models.Student;
import com.example.Springbootfirstproject.Repository.RegRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private RegRepo regRepo;
    public List<RegDetails> getall() {
        return regRepo.findAll();
    }
}
