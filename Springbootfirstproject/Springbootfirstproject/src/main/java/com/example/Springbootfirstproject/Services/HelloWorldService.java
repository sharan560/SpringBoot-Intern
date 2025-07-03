package com.example.Springbootfirstproject.Services;

import com.example.Springbootfirstproject.Models.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class HelloWorldService {


    ArrayList<Employee> l=new ArrayList<>(Arrays.asList
            (new Employee(1,"SUMO","doctor","500"),new Employee(2,"abc","def","")));

    public ArrayList<Employee>getEmp()
    {
        return l;
    }
    public void Setvalues(Employee emp)
    {
        l.add(emp);
    }
    public String  hello() {
        return "hello from GetMapping";
    }

    public String postHello() {
        return "hello from postHello";
    }

    public String PutMapping() {
        return "Hello from PutMapping";
    }

    public String Deletemapping() {
        return "Hello From DeleteMapping";
    }
}
