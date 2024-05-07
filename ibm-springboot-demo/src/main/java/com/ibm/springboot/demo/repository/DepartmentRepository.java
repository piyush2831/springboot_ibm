package com.ibm.springboot.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ibm.springboot.demo.model.Department;
import java.util.List;


@Repository
public interface DepartmentRepository extends MongoRepository<Department, String>{
	List<Department> findByDepartmentId(String departmentId); 

}