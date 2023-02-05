package com.wipro.hr.ems;

import java.util.Scanner;

public class NameDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String[] names = new String[3];
	
	//String[] names = {"Ravi","Raju","Rama"}
		for(int i=0; i < names.length ; i++) 
		{
			System.out.println("Please enter a name");
			names [i] = sc.nextLine();
		}
		
		while (true)
		{	
			System.out.println("Please enter a name to search or q to quit");
			String searchName = sc.nextLine();
		
		if( searchName.equalsIgnoreCase("q"))
		{
			System.out.println("Existing application");
			break;
		}
			
		boolean found =false;
	    for (String s: names)
	    {
	    	if(searchName.equals(s))
	    	{
	    		found=true;
	    		break;
	    	}
	    }
	    if (found)
	    {
	    	System.out.println(searchName+ " found");
	    }
	    else
	    {
	    	System.out.println("Sorry" + searchName + "not found");
	    }
		
		}
		sc.close();
		
	}

}
