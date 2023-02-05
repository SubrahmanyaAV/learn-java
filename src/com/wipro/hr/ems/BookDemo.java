package com.wipro.hr.ems;

import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) {
		Book [] books  = new Book[3];
		Scanner sc = new Scanner (System.in);
		
		for(int i=0; i< books.length; i++)
		{
			System.out.println("Please enter the title:");
			String title = sc.nextLine();
			
			System.out.println("Please enter the author:");
			String author = sc.nextLine();
			
			System.out.println("Please enter the price: ");
			float price = sc.nextFloat();
			sc.nextLine();
			
			books[i] = new Book (price,title, author);
		}
			System.out.println("Please enter a title to search:");
			String searchTitle = sc.nextLine();
			
			boolean found = false;
			Book temp = null;
			for ( Book b: books)
			{
				if (b != null)
				{
					if (searchTitle.equals(b.getTitle()))
					{
						found = true;
						temp = b;
						break;
				    }
				}
			}
			if (found)
			{
				System.out.println("searchTitle" + "found");
				temp.printDetails();
		    }
			else
			{
				System.out.println(" Sorry" + searchTitle + " not found");
			}
			
			sc.close();
		}
}
