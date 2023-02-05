package com.wipro.hr.ems.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	private static final SimpleDateFormat dateTimeFormatter =
			new SimpleDateFormat("yyyy-MM-dd");
	
	public static java.sql.Date strToSQLDate(String strDate)
	{
		java.util.Date date = null;
		try {
			date = dateTimeFormatter.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new java.sql.Date(date.getTime());
	}
	
	
}
