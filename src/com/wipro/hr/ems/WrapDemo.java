package com.wipro.hr.ems;

public class WrapDemo {

	public static void main(String[] args) {
		
		int x = 10;
		
		Integer a = new Integer(x); //wrap to object
		
		int val = a.intValue();  //unwrap
		
		System.out.println(a);
		System.out.println(val);
		
		
		long y = 12345;
		Long b = new Long(y);
		
		long value = b.longValue();
		
		System.out.println(b);
		System.out.println(value);
		
		
		
		String num = "12345";
		long c = Long.parseLong(num);
		
		
		String num2 = "20";
		int inum = Integer.parseInt(num2);
	}

}
