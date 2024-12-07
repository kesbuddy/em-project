package com.projects;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class EmController {

    @GetMapping("employee")
    public List<Employee> getAllEmployee() {
        List<Employee> employee = new ArrayList<>();
        return employee;
    }
    
}
