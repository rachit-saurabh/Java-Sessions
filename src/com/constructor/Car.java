package com.constructor;

public class Car {

	String name;
	String color;
	int seater;
	static int tyre = 4;
	static int gear = 5;
	
	Car(String name, String color, int seater){
		this.name = name;
		this.color = color;
		this.seater = seater;
	}
	
	public void display() {

		System.out.println(name + " " + color + " " + seater + " " + tyre + " " + gear);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("name" + " " + "color" + " " + "seater" + " " + "tyre" + " " + "gear");
		Car c1 = new Car("BMW", "black", 5);
		c1.display();
        Car c2 = new Car("Audi", "white", 7);
        c2.display();
        Car c3 = new Car("Mercedes", "red", 7);
        c3.display();
		
	}
}
