package com.wipro.hr.ems.collections;

import java.util.Set;
import java.util.TreeSet;

public class ProdDemo {

	public static void main(String[] args) {
		                        // Treeset will not print equals and hashcode
		Set<Product> prods = new TreeSet<>();
		
		prods.add(new Product(1,"Samsung Mobile",22000));
		prods.add(new Product(33,"Apple TV",33000));
		prods.add(new Product(43,"LG TV",12000));
		prods.add(new Product(43,"LG TV",12000));
		
		for(Product p : prods)
		{
			System.out.println(p);
		}
	}

}
