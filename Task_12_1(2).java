package com.example.hrtest;

import com.example.hr.Employee;

public class EmployeeTest {
	
	public static void main(String[] args) {
		Employee obje1 = new Employee(288, "Prashad", 5500);
		System.out.println("Id is: " + obje1.getId());
		System.out.println("Name is: " + obje1.getFirstName());
		System.out.println("Salary is: " + obje1.getSalary());
		}

}
