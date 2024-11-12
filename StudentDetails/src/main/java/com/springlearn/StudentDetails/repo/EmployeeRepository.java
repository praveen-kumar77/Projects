package com.springlearn.StudentDetails.repo;

import com.springlearn.StudentDetails.model.EmployeeDetails;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface EmployeeRepository extends MongoRepository<EmployeeDetails, Integer> {
}
