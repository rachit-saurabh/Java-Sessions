package javabasics;

public class Methodsum {
	int a = 10;   //non static variable
	static String s = "Rachit";  //static variable
	
public static void main(String[] args) {
	Methodsum obj = new Methodsum();
	
	System.out.println(s); //called directly
	System.out.println(obj.a); //called with object
	obj.sum(10, 20.2); //called with object
	Methodsum.sum(20); //called directly with class name
	

}

public void sum(int a , double b) {  //non static method
	double c = a+b;
	System.out.println(c);
}

public static void sum(int d) {  //static method
	System.out.println(d);
}
}
