package com.javaprograms;

public class StringtoChar {


	public static void main(String[] args) {
		
		String s = "Rachit";
		System.out.println(s.length());
		
		for (int i=0; i<s.length() ;i++)
		{
			char c = s.charAt(i);
			System.out.println(c);
		}
	}
}
