package com.wipro.hr.ems;

import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<a.length; i++)
		{
			System.out.println(" Enter the array elements:" );
		    a[i]= sc.nextInt();
		}
		
		int max= a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Max element: " + max);	

		sc.close();	
	}
}
