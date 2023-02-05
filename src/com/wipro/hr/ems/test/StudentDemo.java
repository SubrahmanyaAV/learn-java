package com.wipro.hr.ems.test;

import java.util.List;

import com.wipro.hr.ems.Student;
import com.wipro.hr.ems.db.StudentDAO;
import com.wipro.hr.ems.entity.Address;

public class StudentDemo {

	public static void main(String[] args) {
		
		/*StudentDAO dao = new StudentDAO();
		List<Student> list = dao.getAll();
		for(Student s: list)
		{
			System.out.println(s.getRollNo() + "==" + s.getName());
		}
		
		StudentDAO dao = new StudentDAO();
		
		Student s = dao.getStudent(101);
		System.out.println(s);*/
		
		
		
		Address addr = new Address("1st", "Bengaluru");
		Student s = new Student(101, "subbu", addr);
		
		StudentDAO dao = new StudentDAO();
		
		if(dao.create(s))
		{
			System.out.println("Student created");
		}
		
	}

}
