package com.constructor;

public class Student 
{

	int Rollno;
	String Name;
	int Marks;
	
	static String Subject = "Maths";
	static String Schoolname = "Central Academy";
	
	Student(int Rollno, String Name, int Marks)
	{
		this.Rollno = Rollno;
		this.Name = Name;
		this.Marks = Marks;
	}
	
	void display() {
		System.out.println(Rollno + " " + Name + " " + Marks + " " + Subject + " " + Schoolname);
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Rachit", 80);
		s1.display();
		Student s2 = new Student(2,"Rohit",89);
		s2.display();
		Student s3 = new Student(3,"Ankit",92);
        s3.display();
        Student s4 = new Student(4, "Shobit", 96);
        s4.display();
	}

}
