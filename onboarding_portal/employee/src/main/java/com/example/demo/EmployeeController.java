package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class EmployeeController {
    
    @Autowired
    EmployeeService employeeService;


    @PostMapping("/api/employees")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        Employee e = employeeService.addEmployee(employee); 
        return e != null ? ResponseEntity.ok(e) : ResponseEntity.status(500).build();
    }

    @GetMapping("/api/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) {
        Employee e =employeeService.getEmployeeById(id);
        return e!=null ? ResponseEntity.ok(e) : ResponseEntity.status(404).build();
    }


}
