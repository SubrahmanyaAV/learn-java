package com.wipro.hr.ems.test;

import com.wipro.hr.ems.db.BookdbDAO;
import com.wipro.hr.ems.entity.Bookdb;

public class TestBookdbDAO {


	public static void main(String[] args) {
		
		Bookdb b1 = new Bookdb("String to date util", 99.99f, "06-07-2022");
		BookdbDAO dao = new BookdbDAO();
		int bid = dao.create(b1);
		
		System.out.println("Book created successfully " + bid);
		
		
		
		/*if(dao.create(b1))
		{
			System.out.println("Book created successfully");
		}*/
		
	}
}
