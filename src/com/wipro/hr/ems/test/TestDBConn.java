package com.wipro.hr.ems.test;

import java.sql.Connection;

import com.wipro.hr.ems.db.DBConnectionManager;

public class TestDBConn {

	public static void main(String[] args) {
		
		Connection conn = DBConnectionManager.getConnection();
		
		if(conn != null)
		{
			System.out.println("DB Conn Successful");
		}
	}

}
