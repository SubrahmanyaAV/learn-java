package com.wipro.hr.ems;

import java.io.Serializable;

public class Account implements Serializable{
	//instance variable
	private String custName;
	private String accNo;
	private double balance;
	
	private static int objCount;
	
	static {
		System.out.println("Inside static block 1");
	}
	
	// 3 arg const
	public Account(String custName, String accNo, double balance) {
	
		this(custName,accNo);
		this.balance = balance;
		//System.out.println(" 3 arg const ");
		objCount++;
	}
	
	//2 arg constructor
	public Account(String custName, double balance) 
	{
		this.custName = custName;
		this.balance = balance;
	}
	
	public Account(String custName, String accNo) 
	{
		this.custName = custName;
		this.accNo = accNo;
		//System.out.println(" 2 arg const ");
	}
	
	public int getObjCount() {
		return objCount;
	}

	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	static {
		System.out.println("Inside static block 2");
	}
	
	public void displayInfo()
	{
		System.out.println(" Name :" + custName + " account no " + accNo + " Balance " + balance);
	}
	
	

}
