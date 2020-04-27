package com.stringmethods;

public class StringConcept {

	public static void main(String[] args) {
		
		String name = "Rachit";
		String email = "rachit.saurabh@gmail.com";
		String password = "rachit123";
		System.out.println(name.length());
		System.out.println(email.length());
		System.out.println(password.length());
		System.out.println(name.isEmpty());
		System.out.println(email.isEmpty());
		System.out.println(password.isEmpty());
		System.out.println(name.trim());
		/*if (name.length()==0) {
			System.out.println("Name is empty");
		}
		else {
			System.out.println("Valid Name");
		}*/
		
		/*if(name.isEmpty()==false) {
			System.out.println("Valid name");
		}
		else {
			System.out.println("Name is Empty");
		}*/
		
		if(name.trim().isEmpty()) {
			System.out.println("Name is Empty");
		}
		else {
			System.out.println("Valid Name");
		}

	}

}
