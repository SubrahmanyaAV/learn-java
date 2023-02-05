package com.wipro.hr.ems.collections;

import java.util.Set;

import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		//Set<String> names = new LinkedHashSet<>();
		Set<String> names = new TreeSet<String>(); //sorting
		names.add("Subbu");
		names.add("Shanthi");
		names.add("Ravi");
		names.add("Ravi");//duplicate not allowed
		names.add("Kiran");
		
		for(String s : names)
		{
			System.out.println(s);
		}
	}
}
