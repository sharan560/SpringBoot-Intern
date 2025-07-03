package com.example.Springbootfirstproject.Controller;
import com.example.Springbootfirstproject.Models.Employee;
import com.example.Springbootfirstproject.Services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

//@Controller
//@ResponseBody
@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldService sws;


    @GetMapping("/hello")
    public String hello()
    {
        return sws.hello();
    }

    @PostMapping("/hello")
    public String postHello()
    {
        return sws.postHello();
    }

    @PutMapping("/hello")
    public String PutMapping()
    {
        return sws.PutMapping();
    }

    @DeleteMapping("/hello")
    public String DeleteMapping()
    {
        return  sws.Deletemapping();
    }

    @PostMapping("/")
    public void SetArrayListvalues(@RequestBody Employee emp)
    {
        sws.Setvalues(emp);
    }

    @GetMapping("/")
    public ArrayList<Employee> emp()
    {
        return sws.getEmp();
    }
}
