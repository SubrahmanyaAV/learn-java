package com.wipro.hr.ems;

public class TestVehicle {

	public static void main(String[] args) {
	
		//IVehicle c = new Car();
		//c.start();
		//c.stop();
		
		//IVehicle b = new Bus();
		//b.start();
		//b.stop();
		
		IVehicle v = VehicleProvider.getVehicle(IVehicle.TYPE_PET);
		v.start();
		v.stop();
		
		if(v instanceof Dog)
		{
			((Dog)v).wagTail();
		}
	}

}
