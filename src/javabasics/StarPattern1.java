package javabasics;

public class StarPattern1 {

	public static void main(String[] args) {
		
		int i,j,k;
		for (i=0;i<=4;i++) 
		{
			for (j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for (k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
