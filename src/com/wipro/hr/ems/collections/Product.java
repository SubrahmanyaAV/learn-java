package com.wipro.hr.ems.collections;

public class Product implements Comparable<Product>{
	
	private int id;
	private String name;
	private double price;
	
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		Product other = (Product) obj;
		System.out.println("EQUALS METHOD == "+ this.id + "==>" + other.getId());
		return this.id == other.getId();
	}
	
	@Override
	public int hashCode() {
		System.out.println("HASHCODE METHOD == " + this.id);
		return this.id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product o) {
		System.out.println("Inside Comparetor ");
		return this.id - o.getId();
	}
	
	
}
