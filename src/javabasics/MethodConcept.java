package javabasics;

public class MethodConcept {
	
	public static void main(String[] args) {
		
		MethodConcept obj = new MethodConcept();
		obj.sum();
		obj.sum1();
		obj.sum2(20,20);
		
	}
		public void sum() {  //non-static method
			System.out.println("Sum");
		}
		
        public void sum1() {  //static method
	System.out.println("Sum123");
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
}
        
        public void sum2(int x,int y) {
        	int c = x+y;
        	System.out.println(c);
        }
	}

