package com.wipro.hr.ems;

public class Bus implements IVehicle {

	@Override
	public void start() {
		System.out.println("Bus starting");
	}

	@Override
	public void stop() {
		System.out.println("Bus stopping");
	}

}
