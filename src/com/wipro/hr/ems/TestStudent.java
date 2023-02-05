
package com.wipro.hr.ems;

import com.wipro.hr.ems.exception.SMSException;

public class TestStudent {

	public static void main(String[] args) {
		try {
			Student s1 = new Student(101,"  ");
			s1.printDetails();		
		}catch ( SMSException e) {
			System.out.println(e.getInfo());
		}
	}
}
