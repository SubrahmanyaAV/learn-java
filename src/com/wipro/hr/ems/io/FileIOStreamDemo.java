package com.wipro.hr.ems.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamDemo {

	public static void main(String[] args) { 
		
	
	try {
		
		FileInputStream fis = new FileInputStream("C:/Program Files/Java/jdk1.8.0_331/README.html");
		int size = fis.available();
		byte[] data = new byte[size];
		fis.read(data);
		
		FileOutputStream fos = new FileOutputStream("sample.txt");
		fos.write(data);
		System.out.println("file copied successfully");
		
		fis.close();
		fos.close();
		
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}
	/*finally 
	{
		try { 
			if(fis != null)
			fis.close();
			
			 if(fos != null)
				fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
  }
}
