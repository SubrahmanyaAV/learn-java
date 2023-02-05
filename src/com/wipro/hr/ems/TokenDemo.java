package com.wipro.hr.ems;

import java.util.StringTokenizer;

public class TokenDemo {

	public static void main(String[] args) {
		
		String s1 = "Hello,world,how,are,you";
		StringTokenizer tokenizer = new StringTokenizer(s1, ",");
		while(tokenizer.hasMoreTokens())
		{
			System.out.println(tokenizer.nextToken());
		}	
	}
}
