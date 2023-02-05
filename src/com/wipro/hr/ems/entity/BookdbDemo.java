package com.wipro.hr.ems.entity;

import java.util.List;
import java.util.Scanner;

import com.wipro.hr.ems.db.BookDAO;
	
public class BookdbDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BookDAO dao = new BookDAO();
		
		String choice = " ";
		do {
			System.out.println("Please select a choice: ");
			System.out.println("1.Add Book");
			System.out.println("2.Show all books");
			System.out.println("3.Search book by Id");
			System.out.println("4.Delete book by Id");
			System.out.println("5.Update book");
			System.out.println("6.Exit");
			
			choice = sc.nextLine();
			
			switch (choice) {
			case "1":
				System.out.println("Please enter the book name ");
				String bname = sc.nextLine();
				
				System.out.println("Please enter the book id");
				int bid= sc.nextInt(); sc.nextLine();
				
				Book b = new Book(bid, bname);
				;
				if(dao.create(b))
				{
					System.out.println("book created");
				}
				break;
				
			case "2":
				List<Book> list = dao.getAll();
				for(Book bk : list)
				{
					System.out.println(bk.getBid() + "==" + bk.getBname());
				}
				break;
			case "3":
				System.out.println("Please enter book id to search ");
				int searchId = sc.nextInt();  sc.nextLine();
				Book result = dao.getBook(searchId);
				if(result == null)
				{
					System.out.println("Sorry book id not found ");
				}
				else
				{
					System.out.println(result.getBid() + "==" + result.getBname());
				}
				break;
				
			case "4":
				System.out.println("Please enter the book id to delete");
				int deleteId = sc.nextInt(); sc.nextLine();
				if(dao.delete(deleteId))
				{
					System.out.println(deleteId + " Deleted successfully");
				}
				else
				{
					System.out.println("Sorry book with id " + deleteId + " not found");
				}
				break;

			case "5":
				System.out.println("Please enter the book new name");
				String bookNewName = sc.nextLine();
				
				System.out.println("Please enter the book id");
				int bookId = sc.nextInt(); sc.nextLine();
				
				if(dao.update(new Book(bookId, bookNewName)))
				{
					System.out.println(" Book updated successfully");
				}
				else
				{
					System.out.println("sorry book id not found " + bookId);
				}
				break;
				
			case "6":
				System.out.println("Exit");
				break;
			default:
				break;
			}
		} while (!choice.equals("6"));
		sc.close();
	}
}
