package com.wipro.hr.ems;

public class Flightprovider {
	
	public static IFly getFlight (String type)
	{
		if(type.equals(IFly.TYPE_BIRD))
		{
			return new Bird();
		}
		else if(type.equals(IFly.TYPE_SUPERMAN))
		{
			return new Superman();
		}
		else if(type.equals(IFly.TYPE_AIRPLANE))
		{
			return new Airplane();
		}
		else
		{
			return null;
		}
	}

}
