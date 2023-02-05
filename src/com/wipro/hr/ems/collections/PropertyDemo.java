package com.wipro.hr.ems.collections;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.put("Karnataka", "Bengaluru");
		prop.put("TN", "Chennai");
		prop.put("AP", "Hyderabad");
		
		System.out.println(prop.getProperty("Karnataka"));
		
		try {
			prop.store(new FileOutputStream("capitals properties"), "State capitals");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
