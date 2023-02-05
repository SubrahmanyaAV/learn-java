package com.wipro.hr.ems;

public class Truck implements IVehicle2{

	@Override
	public void start() {
		System.out.println("Truck starts");
		
	}

	@Override
	public void stop() {
		System.out.println("Truck stops");
		
	}

	@Override
	public void brake() {
		System.out.println("Truck brake");
		
	}

}
