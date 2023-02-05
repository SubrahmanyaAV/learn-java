package com.wipro.hr.ems;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Please enter your name:");
		String name = sc.nextLine();
		System.out.println(" Please enter your age ");
		int age = sc.nextInt();
		System.out.println("Hello" + name + "your age is " + age );
		
		if (age < 18  ) {
		
			System.out.println( name + "You are too young for java ");
		}
			
		else if (age > 60)
		{
		
			System.out.println(name +" You are too old for java");
		}
		else {
			System.out.println("Welcome to java");
		}
		sc.close();

	}

}
