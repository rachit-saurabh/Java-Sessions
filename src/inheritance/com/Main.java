package inheritance.com;

public class Main {

	
	public static void main(String[] args) 
	{
	Student s = new Student();
	Student.Class();
	Student.study();
	s.exam();
	System.out.println(s.CollegeName);
	System.out.println(s.Subject);
	
	Teacher t = new Teacher();
	Teacher.Class();
	System.out.println(t.CollegeName);
	
		
	}
}
