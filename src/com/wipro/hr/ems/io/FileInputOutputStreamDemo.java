package com.wipro.hr.ems.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Program Files\\Java\\jdk1.8.0_331\\README.html");
		
			FileOutputStream fos = new FileOutputStream("sample.txt");
			
			int a;
			
			while((a = fis.read()) != -1)
			{
				fos.write(a);
			}
			
			System.out.println("file created successsfully");
			
			fis.close();
			fos.close();
					
			}catch (FileNotFoundException e) {
				System.out.println("FileInputOutputStream" + e);
			}catch (IOException e) {
			    System.out.println("FileInputOutputStream" + e);
		    }		
	}
}
