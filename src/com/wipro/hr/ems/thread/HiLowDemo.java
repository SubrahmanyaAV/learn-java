package com.wipro.hr.ems.thread;

public class HiLowDemo {
	
public static void main(String[] args) {
		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		
		Clicker hi = new Clicker(Thread.NORM_PRIORITY + 2);
		Clicker low = new Clicker(Thread.NORM_PRIORITY - 2);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		hi.stop();
		low.stop();
		
		System.out.println("High counter " + hi.count);
		System.out.println("Low counter " + low.count);
	}
}



