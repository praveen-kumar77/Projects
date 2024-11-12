package com.springlearn.StudentDetails.repo;

import com.springlearn.StudentDetails.model.DeletedEmployee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeletedEmployeeRepository extends MongoRepository<DeletedEmployee, Integer> {
}
