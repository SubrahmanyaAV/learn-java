package com.wipro.hr.ems.io;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:/Program Files/Java/jdk1.8.0_331/README.html");
			
			int size = fis.available();
			//System.out.println("File size is " + size);
			
			for(int i=0; i<size; i++)
			{
				System.out.print((char) fis.read());
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(fis != null)
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
