package com.ibm.springboot.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ibm.springboot.demo.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
	
	public abstract List<Employee> findByFirstName(String firstName);

	// no need to define methods for basic CRUD operations

}