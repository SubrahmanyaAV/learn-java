package com.wipro.hr.ems;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		Date d1 = new Date();
		
		System.out.println(d1);
		
		long msec = d1.getTime();
		System.out.println(msec);
		
		String s1 = "05/06/2022 12:57:00 pm";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
		try {
			Date d2 = sdf.parse(s1);
			System.out.println(d2);
			
			java.sql.Date sqld1 = new java.sql.Date(d2.getTime());
			
		}catch (ParseException e) {
			e.printStackTrace();
		}
		
	
		
		

	}

}
