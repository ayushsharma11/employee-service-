package com.example.Employeeservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstname;
    private String lasttname;
    private String email;

    public Employee(String firstname, String lasttname, String email) {
        this.firstname = firstname;
        this.lasttname=lasttname;
        this.email = email;
    }
}
