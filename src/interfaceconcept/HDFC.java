package interfaceconcept;

public class HDFC implements USBank,IndiaBank {
	
	//Over-riding is mandatory

	public void credit() {
		System.out.println("USBANK - Credit");
	}
	
	public void debit() {
		System.out.println("USBANK - Debit");
	}
	
	public void withdraw() {
		System.out.println("USBANK - withdraw");
	}
		
	public void loan() {
		System.out.println("IndiaBank-loan");
	}
	
	public void emi() {
		System.out.println("IndiaBank-emi");
	}

	public void ATM() {
		System.out.println("IndiaBank-ATM");
		
	}

	
}
