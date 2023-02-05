package com.wipro.hr.ems.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ArrayDemo2 {

	public static void main(String[] args) {

		try(ObjectInputStream is = new ObjectInputStream (
				new FileInputStream("array.ser")))
		{
			int[] nums = (int[]) is.readObject();
			
			for(int number : nums)
			{
				System.out.println(number);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
