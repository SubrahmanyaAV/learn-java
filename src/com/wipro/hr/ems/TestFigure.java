package com.wipro.hr.ems;

public class TestFigure {

	public static void main(String[] args) {
	
		Figure r = new Rectangle(20,30);
		System.out.println(r.area());
		
		Figure t = new Triangle(20, 30);
		System.out.println(t.area());
	}

}
