package com.wipro.hr.ems.exception;

import java.io.FileNotFoundException;

public class ThrowsDemo {
	
	static void throwOne() throws FileNotFoundException {
		System.out.println("Inside throwOne.");
		throw new FileNotFoundException();
	}
	
	public static void main(String[] args) {
		try {
			throwOne();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
