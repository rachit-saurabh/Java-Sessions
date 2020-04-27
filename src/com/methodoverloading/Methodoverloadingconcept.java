package com.methodoverloading;

public class Methodoverloadingconcept {

	//2 methods having same name but different parameters
	
	public void show() 
	{   // method with no argument
		System.out.println("method 1");
	}
	
	public void show(String name) 
	{   //method having String argument
		System.out.println("method 2");
	}
	
	public void show(int id) {
		System.out.println("method 3");
	}
	
	public static void main(String[] args) 
	{
		Methodoverloadingconcept mo = new Methodoverloadingconcept();
		mo.show();
		mo.show("Rachit");
		mo.show(10);
	}
}
