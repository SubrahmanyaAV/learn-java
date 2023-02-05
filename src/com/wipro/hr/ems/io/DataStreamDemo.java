package com.wipro.hr.ems.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {

	public static void main(String[] args) {
		//try with resources
		try (DataOutputStream dos = new DataOutputStream(
       			new FileOutputStream("test.dat"));)
		{
			dos.writeInt(101);
			dos.writeDouble(123.45);
			dos.writeUTF("Subbu");
			System.out.println("File written successfully");
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
