package com.example.Employeeservice;

import com.example.Employeeservice.controller.EmployeeService;
import com.example.Employeeservice.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeServiceApplication implements CommandLineRunner {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeServiceApplication(EmployeeService employeeService) {
        this.employeeService=employeeService;
    }

    public static void main(String[] args) {
        SpringApplication.run(EmployeeServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       employeeService.createEmployee(new Employee("Ayush","sharma","john@gmail.com"));
        employeeService.createEmployee(new Employee("Cobu","singh","cobu@gmail.com"));
        employeeService.createEmployee(new Employee("Ram Singh","kumar","ramu@gmail.com"));

    }
}
