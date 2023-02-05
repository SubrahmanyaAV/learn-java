package com.wipro.hr.ems.entity;

public class Bookdb {
	
	private int bid;
	private String title;
	private float price;
	private String createdDate;
	
	
	public Bookdb(String title, float price) {
		super();
		this.title = title;
		this.price = price;
	}

	public Bookdb(String title, float price, String createdDate) {
		this(title,price);
		this.createdDate = createdDate;
	}

	public Bookdb(int bid, String title, float price, String createdDate) {
		this(title, price,createdDate);
		this.bid = bid;
		
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "Bookbd [bid=" + bid + ", title=" + title + ", price=" + price + ", createdDate=" + createdDate + "]";
	}
	
}

