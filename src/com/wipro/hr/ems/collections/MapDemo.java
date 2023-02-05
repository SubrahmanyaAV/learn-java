package com.wipro.hr.ems.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wipro.hr.ems.Student;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> names = new HashMap<>();
		
		names.put(101,"Sada");
		names.put(201, "Anil");
		
		System.out.println(names.get(101));
		
		List<Student> list = new ArrayList<>();
		
		Student s = new Student(111, "Anil");
		
		list.add(s);
		
		for(int i=0; i<list.size();i++)
		{
			list.get(i).printDetails();
		}
	}
}
