package com.constructor;

public class ConstructorConcept {

	String firstname;
	String lastname;
	int id;
	//We use static variable to makes our program memory efficient
	static String companyname = "Cybage"; //static keyword does not occupy any extra space 
	static String city = "Pune"; //static keyword does not occupy any extra space
	
	//Parameterized Constructor (3-parameters)
	ConstructorConcept(String firstname,String lastname,int id)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
	}
	//print on this method basis
	public void display() 
	{
		
		System.out.println(firstname + " " + lastname + " " + id + " " + companyname + " " + city);
		
	}
	
	public static void main(String[] args) {
		
		//Calling the constructor by creating its object and passing the Values to the constructor
		ConstructorConcept c1 = new ConstructorConcept("Rachit", "Saurabh", 10);
		ConstructorConcept c2 = new ConstructorConcept("Shobhit", "Anand", 11);
		ConstructorConcept c3 = new ConstructorConcept("Anand", "Gupta", 12);
		ConstructorConcept c4 = new ConstructorConcept("Ashish", "Singh", 13);
		c1.display();
		c2.display();
		c3.display();
		c4.display();
		

	}

}
