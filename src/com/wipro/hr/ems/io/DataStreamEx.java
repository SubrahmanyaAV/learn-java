package com.wipro.hr.ems.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataStreamEx {

	public static void main(String[] args) {
	
		try (DataInputStream dis = new DataInputStream(
				new FileInputStream("test.dat"));)
		{
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
