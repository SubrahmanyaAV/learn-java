package com.wipro.hr.ems.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		
		names.add("Subbu");
		names.add("Shanthi");
		names.add("Ravi");
		names.add("Kiran");
		//only allowed in list
		names.add(1, "sada");//positional access
		
		Iterator<String> iter = names.iterator();//can be used similar to for loop
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		for(String s: names)
		{
			System.out.println(s);
		}
	}
}
