package com.wipro.hr.ems.entity;

public class Book {
	
	private int bid;
	private String bname;
	private String category;
	
	public Book(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + "]";
	}
	
}
