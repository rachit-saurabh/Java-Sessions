package com.stringmethods;

public class StringComparision {

	public static void main(String[] args) 
	{		
		String s1 = "This is a cat";
		String s2 = "This is a CAT";
		String s3 = "This is a cat";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.concat(" "+s2));
	}

}
