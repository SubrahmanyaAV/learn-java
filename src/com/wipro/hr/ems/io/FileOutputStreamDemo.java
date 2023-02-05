package com.wipro.hr.ems.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		
		String msg = "Hello world, Welcome to java IO session , hope you like it";
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("sample.txt");
			byte[] data = msg.getBytes();
			fos.write(data);
			System.out.println("file created successfully");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally 
		{
			try {
				if(fos != null)
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
