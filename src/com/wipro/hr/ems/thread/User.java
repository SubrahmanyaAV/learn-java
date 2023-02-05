package com.wipro.hr.ems.thread;

public class User implements Runnable{
	
	Thread t;
	Printer p;
	String m;
	
	User(Printer ptr, String msg)
	{
		t = new Thread(this);
		this.p = ptr;
		this.m = msg;
		t.start();
	}

	@Override
	public void run() {
		p.print(m);
	}
}
