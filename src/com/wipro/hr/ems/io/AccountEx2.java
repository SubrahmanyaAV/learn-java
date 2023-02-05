package com.wipro.hr.ems.io;

import java.io.DataInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.wipro.hr.ems.Account;

public class AccountEx2 {

	public static void main(String[] args) {
		
		
		try(DataInputStream dis = new DataInputStream(
						new FileInputStream("account.dat"));) 
		{
			Account a1 = new Account(dis.readUTF(),dis.readUTF(),dis.readDouble());
			a1.displayInfo();	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}	
	}
}
