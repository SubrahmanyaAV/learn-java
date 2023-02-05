package com.wipro.hr.ems;

public class Triangle extends Figure {

	Triangle(double d1, double d2) 
	{
		super(d1, d2);
		System.out.println("Inside Triangle Const");
	}

	@Override
	public double area() {
		return 0.5 * dim1 * dim2;
	}

}
