package com.wipro.hr.ems.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ArrayDemo3 {
	
	public static void main(String[] args) {
		
		try(ObjectOutputStream os = new ObjectOutputStream (
				new FileOutputStream("intarr.txt"));)
		{
			int[] arr ={11,44,22,55,66,77,33};
			os.writeObject(arr);
			System.out.println("array initialized");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
