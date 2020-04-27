package com.abstractdemo;

//If class is abstract in nature: Not necessary that method is also abstract.
//But if any method is abstract in nature then its must that the class is abstract.
// methods can be abstract or concrete
//it will make data hiding from 0 to 100%
//In abstract methods no body is present
public abstract class Vehicle {

	
	static String color;


	public abstract void car();
	
	public abstract void bike();
	
	public void Bus() {
		System.out.println("This is a School Bus");
		
		
	}
}
