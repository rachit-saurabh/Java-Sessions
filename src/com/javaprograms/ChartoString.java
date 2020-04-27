package com.javaprograms;

public class ChartoString {
 
	public static void main(String[] args) {
		
		char c = 'A';
		String s = Character.toString(c);
		System.out.println("String: " + s);
		
		String s1 = String.valueOf(c);
		System.out.println("String: " + s1);
	}
}
