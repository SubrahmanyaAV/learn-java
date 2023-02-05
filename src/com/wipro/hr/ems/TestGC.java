package com.wipro.hr.ems;

public class TestGC {

	public static void main(String[] args) {
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		
		c1 = null;
		c2 = null;
		
		System.gc();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
