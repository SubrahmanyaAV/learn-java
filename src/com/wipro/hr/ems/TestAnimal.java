package com.wipro.hr.ems;

public class TestAnimal {

	public static void main(String[] args) {
		
		//Animal a = new Cat();
		//a.talk();
		
		Animal a = AnimalProvider.getAnimal("FAITHFUL");
		
		if (a != null)
		{
			a.talk();
			
			if(a instanceof Dog)
			{
				((Dog)a).wagTail();
			}
		}	
	}
}
