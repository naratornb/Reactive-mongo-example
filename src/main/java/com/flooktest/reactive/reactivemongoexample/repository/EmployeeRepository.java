package com.flooktest.reactive.reactivemongoexample.repository;

import com.flooktest.reactive.reactivemongoexample.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {

}
