package com.wipro.hr.ems;

public class Book {

	private String title;
	private String author;
	private float price;
	
	public Book ( float price, String title, String author)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public void setTitle (String t)
	{
		title = t;
	}
	
	public String getTitle ()
	{
		return this.title;
	}
	
	public void setAuthor (String a )
	{
		author= a;
	}
	public String getAuthor()
	{
		return this.author;
	}
	public void setPrice (float pr)
	{
		if(pr <= 0)
		{
			System.out.println("Invalid price , cannot be zero or negative");
			return;

		}
		price = pr;
	}
	public float getPrice()
	{
		return this.price;
	}
	public void printDetails()
	{
		System.out.println("Title" + title + "Author" + author + "Price" + price);
	}
}
