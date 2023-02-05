package com.wipro.hr.ems;

public class TestMulti {

	public static void main(String[] args) {
		printSalary(new Director("Sub","bu",100));
		
	}
	
	private static void printSalary(Object obj)
	{
		if(obj instanceof Director)
		{
			System.out.println("Salary is 1 lakh");
		}
		else if(obj instanceof Manager)
		{
			System.out.println("Salary is 50k");
		}
		else if(obj instanceof Employee)
		{
			System.out.println("Salary is 10k");
		}
	}

}
