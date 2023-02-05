package com.wipro.hr.ems;

public class Counter {
	
	public static int COUNT;
	
	public Counter()
	{
		COUNT++;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Before Finalize ==>> " + COUNT);
		COUNT--;
		System.out.println("After Finalize <<<<" + COUNT);
	
	}

}
