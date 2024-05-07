package com.ibm.demo.model;

public class Employee {
	private int eid;
	private String firstName;
	private double salary; 
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getFirstName() {
		return firstName;
	}
	 public void setFirstName(String firstName) {
		 this.firstName = firstName;
	 }
	 
	 public double getSalary() {
		 return salary;
	 }
	 
	 public void setSalary( double salary) {
		 this.salary = salary;
	 }
	 @override
	 public String toString() {
		 return "Employee[eid = " + eid + "]
	 }
	

}
