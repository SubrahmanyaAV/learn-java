package com.wipro.hr.ems;

public class TestAccount {

	public static void main(String[] args) {
		
		Account a1 = new Account ("Subba" ,"101",99000.0);
		System.out.println(a1.getObjCount());
	
		Account a2 = new Account ("Anil" , "202", 1000);
		
		Account a3 = new Account ("Kiran", "303", 2000);
		System.out.println(a1.getObjCount());
		
	
	}

}
