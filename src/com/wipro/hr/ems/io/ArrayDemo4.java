package com.wipro.hr.ems.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ArrayDemo4 {

	public static void main(String[] args) {
		
		try(ObjectInputStream is = new ObjectInputStream(
				new FileInputStream("intarr.txt"));) 
		{
			int[] arr =(int[]) is.readObject();
			int max = arr[0];
			
			for(int i=0 ; i<arr.length ; i++)
			{
				if(arr[i]>max)
				{
			    max = arr[i];
				}
			} 
			System.out.println(" Max array is " + max);	
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
}
