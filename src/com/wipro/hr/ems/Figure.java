package com.wipro.hr.ems;

public abstract class Figure {
	
	double dim1;
	double dim2;
	
	 Figure (double dim1,double dim2)
	 {
		 this.dim1 = dim1;
		 this.dim2 = dim2;
		 System.out.println("Inside Figure Const");
	 }
	 
	 public abstract double area();
	

}
