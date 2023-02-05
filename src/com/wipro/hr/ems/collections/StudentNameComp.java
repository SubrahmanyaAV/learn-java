package com.wipro.hr.ems.collections;

import java.util.Comparator;

import com.wipro.hr.ems.Student;

public class StudentNameComp implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
