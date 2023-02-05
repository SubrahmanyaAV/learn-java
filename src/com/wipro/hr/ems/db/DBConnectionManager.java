package com.wipro.hr.ems.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.wipro.hr.ems.exception.SMSException;

public class DBConnectionManager {
	
	static
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection()
	{
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","okay");
		} catch (SQLException e) {
			
			throw new SMSException("DB Conn error during create,contact admin");
		}
		return conn;
	}
}

