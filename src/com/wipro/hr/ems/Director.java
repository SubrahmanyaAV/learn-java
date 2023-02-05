package com.wipro.hr.ems;

public class Director extends Manager {

	Director(String fname, String lname, int id) {
		super(fname, lname, id);
		System.out.println("Inside Director Const");
	}

}
