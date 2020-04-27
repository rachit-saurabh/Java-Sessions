package com.registrationform;

import java.util.Scanner;

public class Register {

	static String Name;
	static String Emailid;
	static String Password;
	
	Register(String Name, String Emailid, String Password){
		Register.Name = Name;
		Register.Emailid = Emailid;
		Register.Password = Password;
	}
	public static String display() 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Name: ");
		Name =  in.nextLine();
		if(Name.length()==0) 
		{
			System.out.println("Name is invalid");
			return Name;
		}
		else {
			System.out.println("Name is correct");
		}
		
		System.out.println("Enter the Emailid: ");
		Emailid =  in.nextLine();
		if(Emailid.trim().length()!=0 && Emailid.contains("@")) 
		{ 
			System.out.println("Email-id is correct");
		}
		else {
			System.out.println("Invalid Email-id is entered");
			return Emailid;
		}
		
		System.out.println("Enter the Password: ");
		Password =  in.nextLine();
		if(Password.trim().length()!=0)
		{
			System.out.println("Password is correct");
			
		}
		else {
			System.out.println("In-Valid Password");
			
			return Password;
		}
		System.out.println("Submit\nRegistration is successful");
		return null;	
	}
	
	public static void main(String[] args) {
		display();
		
	}
}
