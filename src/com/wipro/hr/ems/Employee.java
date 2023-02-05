package com.wipro.hr.ems;

public class Employee {
	
	String fname;
	String lname;
	int id;
	
	Employee(String fname,String lname,int id)
	{
		this.fname = fname;
		this.lname = lname;
		this.id = id;
		System.out.println("Inside Employee Const");
	}
	

}
