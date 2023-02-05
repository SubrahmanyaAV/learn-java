package com.wipro.hr.ems.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.wipro.hr.ems.Account;

public class ObjSerialDemo2 {

	public static void main(String[] args) {
		
		try(ObjectInputStream is = new ObjectInputStream (
				new FileInputStream("account.ser")))
		{
			Account a = (Account) is.readObject();
			a.displayInfo();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
