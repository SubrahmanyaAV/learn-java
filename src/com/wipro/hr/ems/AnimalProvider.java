package com.wipro.hr.ems;

public class AnimalProvider {
	
	public static Animal getAnimal(String type)
	{
		if(type.equals("FAITHFUL"))
		{
			return new Dog();
		}
		else if(type.equals("CUNNING"))
		{
			return new Cat();
		}
		else 
		{
			return null;
		}
	}

}
