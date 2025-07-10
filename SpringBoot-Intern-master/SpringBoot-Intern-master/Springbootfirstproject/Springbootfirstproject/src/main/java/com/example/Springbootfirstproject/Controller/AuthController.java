package com.example.Springbootfirstproject.Controller;

import com.example.Springbootfirstproject.Models.RegDetails;
import com.example.Springbootfirstproject.Models.Student;
import com.example.Springbootfirstproject.Services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public String register(@RequestBody RegDetails student) {
        authService.registerUser(student);
        return "resisterd";
    }

    @GetMapping("/login")
    public String login() {

        return "resisterd";
    }

}
