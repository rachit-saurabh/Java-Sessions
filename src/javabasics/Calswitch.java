package javabasics;

import java.util.Scanner;

public class Calswitch {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int no1 = s.nextInt();
		System.out.println("Enter second number: ");
		int no2 = s.nextInt();
		System.out.println("Select symbol (+,-,*,/)");
		String sym = s.next();
		int res;
		switch(sym)
		{
		case "+": res = no1 + no2;
		System.out.println(res);
		break;
		case "-": res = no1 - no2;
		System.out.println(res);
		break;
		case "*": res = no1 * no2;
		System.out.println(res);
		break;
		case "/": res = no1 / no2;
		System.out.println(res);
		break;
		}

	}

}
