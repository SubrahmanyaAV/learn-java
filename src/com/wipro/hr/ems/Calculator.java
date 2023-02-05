package com.wipro.hr.ems;

public class Calculator {

	public int divide(int x, int y)
	{
		int result = 0;
		int[] nums = new int[3];
		Animal a = null;
		
		try
		{
			a.talk();
			nums[3] = 99;
			System.out.println("Before dividing ==>>");
			result = x / y;
			System.out.println("After dividing ==>>");
		}
		catch(ArrayIndexOutOfBoundsException iobe)
		{
			System.out.println("Invalid array index: " + iobe.getMessage());
		}
		catch(RuntimeException rte)
		{
			System.out.println("Runtime Exception: " + rte.getMessage());
		}
		return result;
	}
	
}
