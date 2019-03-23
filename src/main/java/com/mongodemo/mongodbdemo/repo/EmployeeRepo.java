package com.mongodemo.mongodbdemo.repo;

import com.mongodemo.mongodbdemo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepo extends MongoRepository<Employee,String> {
}
