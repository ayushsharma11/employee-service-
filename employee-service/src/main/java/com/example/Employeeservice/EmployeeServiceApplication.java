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
    private String[] empFirstName = new String[] {"Ayush","Cobu","Ram Singh"};
    private String[] empLastName = new String[] {"sharma","singh","kumar"};
    private String[] empEmail = new String[] {"john@gmail.com","cobu@gmail.com","ramu@gmail.com"};

    @Autowired
    public EmployeeServiceApplication(EmployeeService employeeService) {
        this.employeeService=employeeService;
    }

    public static void main(String[] args) {
        SpringApplication.run(EmployeeServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       employeeService.createEmployee(new Employee(empFirstName[0],empLastName[0],empEmail[0]));
        employeeService.createEmployee(new Employee(empFirstName[1],empLastName[1],empEmail[1]));
        employeeService.createEmployee(new Employee(empFirstName[2],empLastName[2],empEmail[1]));

    }
}
