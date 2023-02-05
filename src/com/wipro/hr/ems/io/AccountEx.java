package com.wipro.hr.ems.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.wipro.hr.ems.Account;

public class AccountEx {

	public static void main(String[] args) {
		
		Account a1 = new Account("Sada","1234",3344.66);
		
		try(DataOutputStream dos = new DataOutputStream(
				new FileOutputStream("account.dat"));)
		{
			dos.writeUTF(a1.getCustName());
		    dos.writeUTF(a1.getAccNo());
		    dos.writeDouble(a1.getBalance());

		    System.out.println("account created successfully");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
