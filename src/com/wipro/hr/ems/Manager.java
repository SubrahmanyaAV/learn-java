package com.wipro.hr.ems;

public class Manager extends Employee {

	Manager(String fname, String lname, int id)
	{
		super(fname, lname, id);
		System.out.println("Inside Manager Const");
	}

}
