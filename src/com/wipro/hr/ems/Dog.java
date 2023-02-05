package com.wipro.hr.ems;

public class Dog extends Animal implements IVehicle{
	
	public void talk()
	{
		System.out.println("Bow Wow!!");
	}
	public void wagTail()
	{
		System.out.println("Wagging tail");
	}

	@Override
	public void eat() {
		System.out.println("Dog eats Pedigree");
		
	}

	@Override
	public void start() {
		System.out.println("Dog starting");
	}

	@Override
	public void stop() {
		System.out.println("Dog stopping");
		
	}
}
