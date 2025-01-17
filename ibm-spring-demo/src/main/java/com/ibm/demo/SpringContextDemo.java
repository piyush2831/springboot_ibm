package com.ibm.demo;
import com.ibm.demo.model.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;



public class SpringContextDemo {
	public static void main(String[] args) {
//		Employee emp= new Employee();
		ApplicationContext context = new ClassPathXmlApplicationContext();
		
		Employee emp = context.getBean("employee", Employee.class);
		System.out.println(emp.toString());
		Employee emp2 = context.getBean("employee2", Employee.class);
		System.out.println(emp2.toString());
		
		//System.out.println(emp.hashCode());
		
		((AbstractApplicationContext)context).close();
	}

}
