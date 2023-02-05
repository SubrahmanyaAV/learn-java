package com.wipro.hr.ems.collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CollegeProp {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("college.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(" Welcome to " + prop.getProperty("COLLEGE_NAME"));
		System.out.println(" All the very best from " + prop.getProperty("PRINCIPAL_NAME"));
	}

}
