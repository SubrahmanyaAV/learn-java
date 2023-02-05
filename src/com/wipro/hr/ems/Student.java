package com.wipro.hr.ems;

import com.wipro.hr.ems.entity.Address;
import com.wipro.hr.ems.exception.SMSException;

public class Student implements Comparable<Student>{ 

	private int rollNo;
	private String name;
	
	//student has an address
	private Address address;
	
	 public Student(int rollNo, String name, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	 
	 //2 args cons
	public Student(int rollNo,String name)  throws SMSException
		{
			if(rollNo <= 0)
			{
				throw new SMSException(" Roll no cannot be negative or zero: " + rollNo);
			}
			if(name.trim().isEmpty())
			{
				throw new SMSException("Name cannot be empty");
			}
			this.rollNo= rollNo;
			this.name= name;
		} 
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
	public void printDetails() {
		System.out.println(" Roll no " + rollNo + " Name " + name );
	}
	@Override
	public int compareTo(Student o) {
		return this.rollNo - o.getRollNo();
		//return o.getRollNo() - this.rollNo;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}