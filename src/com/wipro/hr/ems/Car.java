package com.wipro.hr.ems;

public class Car implements IVehicle {

	@Override
	public void start() {
		System.out.println("Car starting");
	}

	@Override
	public void stop() {
		System.out.println("Car stopping");
	}
	
	

}
