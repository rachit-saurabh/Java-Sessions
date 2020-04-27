package javabasics;

public class ArrayConcept {
public static void main(String[] args) {
	
	// One Dimentional Array
	
	//int array
	int i[] = new int[5];
	i[0] = 10;
	i[1] = 20;
	i[2] = 30;
	i[3] = 40;
	i[4] = 50;
	
	System.out.println(i[2]);
	System.out.println(i.length);
	
	//Use For loop
	
	for(int j=0;j<i.length;j++) {
		System.out.println(i[j]);
		}
	
	//1. Size problem: to overcome we use: ArrayList and Collections.
	//2. DataType problem : to overcome we use : Object array
	Object obj[] = new Object[5];{
		
	obj[0] = 5;
	obj[1] = "Rachit";
	obj[2] = 'M';
	obj[3] = 12.33;
	obj[4] = "Pune";
	
	System.out.println(obj[3]);
	for(int k = 0;k<obj.length;k++) {
		System.out.println(obj[k]);
	}
	}
}
}


