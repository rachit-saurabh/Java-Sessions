package interfaceconcept;

public interface USBank {
	
	//Only define Method not body
	//Method should not be static
	//Variable must be static and final by default
	
	int minbalance = 100;
	
	public void credit();
	
	public void debit();
	
	public void withdraw();

}
