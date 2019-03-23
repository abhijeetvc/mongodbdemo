package com.mongodemo.mongodbdemo.controller;


import com.mongodemo.mongodbdemo.model.Employee;
import com.mongodemo.mongodbdemo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping(value="/save")
    public String saveData(@RequestBody Employee employee){
        employeeRepo.save(employee);
        return "Data saved";
    }

  //  public Employee findEmployee()
}
