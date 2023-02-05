
package com.wipro.hr.ems;

import java.util.Scanner;

public class BookDirectory {

	public static void main(String[] args) {
		Book[] books = new Book[10];
		int idx = 0;
		Scanner sc = new Scanner(System.in);
		String choice = " ";
		
		do {
			System.out.println("Please select a choice:");
			System.out.println("1.Add Book");
			System.out.println("2.Search Book by its title:");
			System.out.println("3.Search Book by its author:");
			System.out.println("4.Search Book by its price:");
			System.out.println("5.Display all the Books");
			System.out.println("6.Delete Book by its title");
			System.out.println("7.Exit");
			
			choice = sc.nextLine();
			
			switch(choice) {
			case "1":
				System.out.println(" Please enter the book title: ");
				String title = sc.nextLine();
				
				System.out.println(" Please enter the book author: ");
				String author = sc.nextLine();
				
				System.out.println(" Please enter the book price: ");
				float price = sc.nextFloat();  sc.nextLine();
				
				Book b = new Book(price,title,author);
				books [idx] = b;
				idx++;
				
				System.out.println(" Book created successfully ");
				break;
				
			case "2":
				System.out.println(" Search book by its title: ");
				String searchTitle = sc.nextLine();
				
				boolean found = false;
				Book temp = null;
				
				for ( Book bk : books)
				{
					if ( bk != null)
					{
						if (searchTitle.equals(bk.getTitle()))
						{
							found = true;
							temp = bk;
							break;
						}
					}
				}
				if (found)
				{
					System.out.println(" Book found ");
					temp.printDetails();
				}
				else
				{
					System.out.println(" Sorry Book not found for Title " +  searchTitle );
				}
				break;
				
			case"3": 
				System.out.println( " Search book by its author: " );
				String searchAuthor = sc.nextLine();
				
				boolean foundauthor = false;
				Book temp1 = null;
				
				for ( Book bk : books)
				{
					if ( bk != null)
					{
						if ( searchAuthor.equals(bk.getAuthor()) )
						{
							foundauthor = true;
							temp1 = bk;
							break;
						}
					}
				}
				if (foundauthor)
				{
					System.out.println(" Book found ");
					temp1.printDetails();
				}
				else
				{
					System.out.println(" Sorry Book not found for author " +  searchAuthor );
				}
				break;
				
			case"4":
				
				System.out.println(" Search book by its price: ");
				float searchPrice = sc.nextInt(); sc.nextLine();
				
				boolean foundprice = false;
				Book temp2 = null;
				
				for ( Book bk : books)
				{
					if ( bk != null)
					{
						if ( searchPrice == bk.getPrice())
						{
							foundprice = true;
							temp2 = bk;
							break;
						}
					}
				}
				if (foundprice)
				{
					System.out.println(" Book found ");
					temp2.printDetails();
				}
				else
				{
					System.out.println(" Sorry Book not found for price " +  searchPrice );
				}
				break;
				
			case"5":
				for(int i = 0; i < idx; i++)
				{
					Book temp3 = books [i];
					if(temp3 != null)
						temp3.printDetails();
				}
				break;
				
			case"6":
				System.out.println(" Delete Book by its title ");
				String deleteTitle =  sc.nextLine();
				
				boolean delete = false;
				
				for (int i =0; i < idx; i++)
				{
					if(books[i] != null && books[i].getTitle().equals(deleteTitle))
					{
						delete = true;
						books[i] = null;
						break;
					}
					if(delete)
					{
						System.out.println(" Deleted successfully ");
					}
				}	
				break;
				
			case"7":
				System.out.println(" Exiting application ");
				break;
			default:
				System.out.println(" Invalid choice! ");
				break;
			}
			
		}while(!choice.equals("7"));
		
		sc.close();
	}

}
