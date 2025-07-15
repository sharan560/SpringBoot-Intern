package com.example.springbootfirst.Controller;

import com.example.springbootfirst.controllers.EmployeeController;
import com.example.springbootfirst.models.RegisterDetails;
import com.example.springbootfirst.services.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class EmployeeControllerTest {

        @Mock
        EmployeeService employeeService;
        @InjectMocks
        EmployeeController employeeController;

        @BeforeEach
        public void init(){
            MockitoAnnotations.initMocks(this);
        }
        @Test
        void tesRoute()
        {
            String str=employeeController.route();
            assertEquals("Welcome to SpringBoot Security",str);
        }
        @Test
        void testGetMethod(){
            RegisterDetails emp1=new RegisterDetails();
            RegisterDetails emp2=new RegisterDetails();

            when(employeeService.getMethod()).thenReturn(Arrays.asList(emp1,emp2));
            List<RegisterDetails> result=employeeController.getMethod();
            assertEquals(2,result.size());
        }


}
