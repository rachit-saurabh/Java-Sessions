package javabasics;

public class StringConcepts {

	public static void main(String[] args) {

       String firstname = "Rachit";
       String lastname = "    Sau    arbh";
       String Mobno = "81497   96067     ";
       String city = "Pune";

       System.out.println(firstname + " " + (lastname.replaceAll("\\s+","").trim()) + " " + Mobno.replaceAll("\\s+",""));
       System.out.println(firstname+" ".concat((lastname).replaceAll("\\s+","").trim())+" ".concat((Mobno).replaceAll("\\s+","").trim()));
       System.out.println(firstname.length());
       System.out.println(lastname.replaceAll("\\s+","").length());
       int a = (Mobno.replaceAll("\\s+","").length());
       System.out.println(a);
       boolean b = firstname.isEmpty();
       System.out.println(b);
       
	}

}
