package com.wipro.hr.ems.thread;

public class MyThreadR implements Runnable {
	
	Thread t;
	
	MyThreadR(String threadName)
	{
		t= new  Thread(this, threadName);
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
