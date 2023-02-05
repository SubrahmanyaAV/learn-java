package com.wipro.hr.ems.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		try(ObjectOutputStream os = new ObjectOutputStream (
									new FileOutputStream("array.ser")))
		{
			int[] nums = {22,33,44};
			os.writeObject(nums);
			System.out.println("Array serialized");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
