package com.wipro.hr.ems.thread;

public class Printer {
	
	public synchronized void print(String msg)
	{
		System.out.print("[" + msg);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("]");
	}

}
