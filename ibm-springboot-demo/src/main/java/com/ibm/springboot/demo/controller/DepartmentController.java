package com.ibm.springboot.demo.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.springboot.demo.model.Department;
import com.ibm.springboot.demo.model.Employee;
import com.ibm.springboot.demo.service.DepartmentService;

@RestController
@RequestMapping("dep")

public class DepartmentController {

	@Autowired
	DepartmentService departmentService;

	@GetMapping("get-dep-by-depid/{did}")
	public ResponseEntity<Department> getDepByDId(@PathVariable(name = "did") String departmentId) {
		System.out.println(departmentId);
		Department department = departmentService.getDepartmentById(departmentId);
		System.out.println(department.toString());
		HttpStatus status = HttpStatus.OK;
		HttpHeaders headers = new HttpHeaders();
		headers.add("message","Department data fetched successfully");
		ResponseEntity<Department> response = new ResponseEntity<Department>(department,headers,status);
		return response;
	}

	@GetMapping("get-all-dep")
	public ResponseEntity<List<Department>> getAllEmps() {
		List<Department> depList =departmentService.getAllDepartments();
		depList.forEach(System.out::println);
		HttpStatus status = HttpStatus.OK;
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "All employees data fetched successfully!");
		ResponseEntity<List<Department>> response = new ResponseEntity<List<Department>>(depList, headers, status);
		return response;
	}
	@PostMapping("add-dep-data")
	public ResponseEntity<Department> adddep(@RequestBody Department department){
		Department depToAdd= departmentService.addDepartment(department);
		HttpStatus status = HttpStatus.OK;
		HttpHeaders headers= new HttpHeaders();
		headers.add("message", "Department added");
		ResponseEntity<Department> response = new ResponseEntity<Department>(depToAdd, headers, status);

		
		return response;
		
	}

	

	
}