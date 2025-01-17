package com.ibm.springboot.demo.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.springboot.demo.model.Department;
import com.ibm.springboot.demo.repository.DepartmentRepository;

@Service
public class DepartmentServicelmpl implements DepartmentService{

	private final Logger LOG=LoggerFactory.getLogger(this.getClass());	
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		LOG.info("getAllDepartment");
		return departmentRepository.findAll();
	}
	
	@Override
	public Department getDepartmentById(String objectId) {
		// TODO Auto-generated method stub
		LOG.info(objectId.toString());
		return departmentRepository.findById(objectId).get();
	}

	@Override
	public Department addDepartment(Department department) {
		// TODO Auto-generated method stub
		LOG.info(department.toString());
		return departmentRepository.save(department);
	}

	@Override
	public Department updateDepartment(Department department) {
		LOG.info(department.toString());
		this.getDepartmentById(department.getDepartmentId());
		// better code is needed? 
		return departmentRepository.save(department);
	}

	@Override
	public Department deleteDepartment(String departmentId) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public List<Department> getDepartmentByName(String departmentName) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Department> getDepartmentByLocation(String location) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Department> getDepartmentBymanagerID(String managerId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}