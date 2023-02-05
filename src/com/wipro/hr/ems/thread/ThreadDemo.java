package com.wipro.hr.ems.thread;

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Start of program " + Thread.currentThread());
		MyThread t1 = new MyThread("Child1");
		t1.start();
		
		MyThreadR t2 = new MyThreadR("RunnableChild");
		t2.t.start();
		
		/*for(int i=5; i>0 ; i--)
		{
			System.out.println(Thread.currentThread() + ":" + i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}*/
		
		try {
			t1.join();
			t2.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread() + " Exit==>>");
	}
}
