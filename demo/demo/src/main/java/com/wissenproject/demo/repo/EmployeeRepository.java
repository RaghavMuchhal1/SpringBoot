package com.wissenproject.demo.repo;

import com.wissenproject.demo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class EmployeeRepository implements MongoRepository<Employee, Long> {

}
