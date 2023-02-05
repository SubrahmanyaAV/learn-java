package com.wipro.hr.ems.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneDirectory {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		Scanner sc = new Scanner(System.in);
		String choice = " ";
		
		do {
			System.out.println("1.Add an entry");
			System.out.println("2.search for person by phone number");
			System.out.println("3.Exit");
			
			choice = sc.nextLine();
			
			switch(choice) {
			case "1":
				System.out.println("Enter the phone number ");
				String phonenumber = sc.nextLine();
				
				System.out.println("Enter the name ");
				String name = sc.nextLine();
				
				map.put(phonenumber, name);
				System.out.println("added successfully");
				
			case "2":
				System.out.println("search for person by phone number");
				String searchPhonenumber = sc.nextLine();
				
				String temp=map.get(searchPhonenumber);
				
				if(temp != null)
				{
					System.out.println(temp);
				}
				else
				{
					System.out.println("not found");
				}
			break;
			
			case "3":
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid choice");	
				break;
			}
			
		}while(!choice.equals("3"));
		sc.close();
	}
}
