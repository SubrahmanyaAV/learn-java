package com.wipro.hr.ems;

public class TestCalc {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		try
		{
			int remainder = c.divide(10, 0);
			System.out.println("After dividing remainder is " +remainder);
		}
		catch(NullPointerException npe)
		{
			System.out.println("Null pointer exception");
		}
		
	}

}
