package com.wipro.hr.ems;

public class TestFlight {

	public static void main(String[] args) {
		
			IFly f = Flightprovider.getFlight(IFly.TYPE_AIRPLANE);
				f.fly();
	}
}
