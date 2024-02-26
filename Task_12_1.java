package com.example.hr;

public class Employee {
	
	private int Id;
	private String FirstName;
	private double Salary;

	public Employee(int Id, String FirstName, double Salary) {
	        this.Id = Id;
	        this.FirstName = FirstName;
	        this.Salary = Salary;
	}

	public int getId() {
	        return Id;
	    }

	    
	    public String getFirstName() {
	        return FirstName;
	    }

	public double getSalary() {
	        return Salary;
	    }

}
