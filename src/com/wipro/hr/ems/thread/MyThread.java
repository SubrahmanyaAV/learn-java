package com.wipro.hr.ems.thread;

public class MyThread extends Thread{
	
	public MyThread(String threadName)
	{
		super(threadName);
		System.out.println("Inside constructor===" + Thread.currentThread());
	}
	
	@Override
	public void run() {
	
		System.out.println(" Inside " + Thread.currentThread());
		
		for(int i=5; i>0; i--)
		{
			System.out.println(Thread.currentThread() + ":" + i);
			try {
				Thread.sleep(250);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread() + " Exiting RUN Method==>> ");
	}
}
