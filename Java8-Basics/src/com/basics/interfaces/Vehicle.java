package com.basics.interfaces;

public class Vehicle {
	public static void main(String args[]) {
	Drivable d1= new Car();
	Drivable d2= new Bike();
	Drivable d3= new Truck();
	d1.driven();
	d2.driven();
	d3.driven();
	
}
}	
	
class Car implements Drivable{
	
	@Override
	public void driven()
	{
		System.out.println("The car is being driven");
	}
}

class Bike implements Drivable{
	
	@Override
	public void driven()
	{
		System.out.println("The bike is being driven");
	}
}


class Truck implements Drivable{
	
	@Override
	public void driven()
	{
		System.out.println("The truck is being driven");
	}
}
