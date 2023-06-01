package com.learning.employee.controller;

import com.learning.employee.model.Employee;
import com.learning.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/employess")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
/*
    @GetMapping(value = "/getAllEmployees",produces = "application/json")
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    @PostMapping(value = "/add",produces = "application/json",consumes = "application/json")
    public void addUser(@RequestBody Employee employee){
        employeeRepository.save(employee);
    }*/
}
