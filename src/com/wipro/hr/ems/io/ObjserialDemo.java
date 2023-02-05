package com.wipro.hr.ems.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.wipro.hr.ems.Account;

public class ObjserialDemo {

	public static void main(String[] args) {

		try(ObjectOutputStream os = new ObjectOutputStream (
				new FileOutputStream("account.ser")))
		{
			Account a = new Account("Sada", "1234", 9999.99);
			os.writeObject(a);
			System.out.println("object serialized success");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
