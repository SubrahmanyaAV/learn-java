package com.wipro.hr.ems;

public class Rectangle extends Figure {

	Rectangle(double d1, double d2)
	{
		super(d1, d2);
		System.out.println("Inside Rect Const");
	
	}

	@Override
	public double area() {
		return dim1 * dim2;
	} 
	
 
}
