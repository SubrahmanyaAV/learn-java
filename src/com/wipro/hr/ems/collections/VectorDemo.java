package com.wipro.hr.ems.collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> names = new Vector<String>();
		names.add("Kiran");
		names.add("Anil");
		
		for(String s : names)
		{
			System.out.println(s);
		}
	}
}
