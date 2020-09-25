package com.example.Employeeservice.service;

import com.example.Employeeservice.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public  Employee createEmployee(Employee employee);
}
