package javabasics;

public class StringReverse 
{

	public static void main(String[] args) 
	{
		//Using length() and charAt() method
		//Using for loop in reverse
		String name = "Rachit Saurabh";
		String reverse = "";
		int l = name.length(); 
		for(int i=(l-1) ; i>=0 ; i--)
		{
		reverse = reverse + name.charAt(i);
		}
		System.out.println(reverse);
	}
}
