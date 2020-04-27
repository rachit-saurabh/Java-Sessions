package interfaceconcept;

public class MainTest {

	public static void main(String[] args) {
		
		//As the variable under the interface are by default static and final
	System.out.println(USBank.minbalance);
	System.out.println(IndiaBank.minbalance);
	
	//Object creation for child class
	HDFC h = new HDFC();
	h.credit();
	h.ATM();
	h.debit();
	h.loan();
	h.emi();
	h.withdraw();
	System.out.println("*****************");
	
	//object creation for child class but assigned to USBank variable 
	USBank u = new HDFC();
	u.credit();
	u.debit();
	u.withdraw();
	System.out.println("*****************");
	
	//object creation for child class but assigned to IndiaBank variable
	IndiaBank b = new HDFC();
	b.ATM();
	b.loan();
	b.emi();
	}
}
