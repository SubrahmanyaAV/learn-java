package com.wipro.hr.ems.collections;

import java.util.Set;
import java.util.TreeSet;

import com.wipro.hr.ems.Student;

public class SetDemo2 {

	public static void main(String[] args) {
		
		Set<Student> studs = new TreeSet<>(new StudentNameComp());
		
		studs.add(new Student(111,"Sada"));
		studs.add(new Student(222,"Anil"));
		studs.add(new Student(333,"Kiran"));
		
		for(Student s : studs)
		{
			s.printDetails();
		}
	}

}
