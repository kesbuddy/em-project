package com.projects;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class EmController {
    List<Employee> employees = new ArrayList<>();
    @GetMapping("employee")
    public List<Employee> getAllEmployee() {
        return employees;
    }

    @PostMapping("employee")
    public String postMethodName(@RequestBody Employee employee) {
        //TODO: process POST request
        employees.add(employee);
        return "Saved succesfully";
    }
    
    
}
