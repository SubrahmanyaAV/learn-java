package com.wipro.hr.ems;

public interface IVehicle {
	
	public static final String TYPE_PASSANGER = "P";
	String TYPE_LUXURY = "L";
	String TYPE_PET = "D";
	
	public void start();
	public void stop();

}
