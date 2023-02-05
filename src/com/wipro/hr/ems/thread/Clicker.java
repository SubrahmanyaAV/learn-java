package com.wipro.hr.ems.thread;

public class Clicker implements Runnable {
	
	long count;
	Thread t;
	
	private volatile boolean running = true;
	
	Clicker(int priority)
	{
		t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread() + " Inside RUN METHOD");
			
		while(running)
		{
			count++;
		}
		
	}
	public void stop()
	{
		System.out.println(Thread.currentThread() + " Inside STOP METHOD");
		running = false;
	}
}
