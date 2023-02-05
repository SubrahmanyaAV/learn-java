package com.wipro.hr.ems;

public class VehicleProvider {
	
	public static IVehicle getVehicle(String type)
	{
		if(type.equals(IVehicle.TYPE_LUXURY))
		{		
			return new Car();		
	    }
		else if(type.equals(IVehicle.TYPE_PASSANGER))
		{
			return new Bus();
		}
		else if(type.equals(IVehicle.TYPE_PET))
		{
			return new Dog();
		}
		else
		{
			return null;
		}
	}
}
