package tutorialPag;



public class Customer {
	
	private String secretLairLocation;
	private String name;
	private double evilFunds;
	
	public Customer() {
		name = " ";
		secretLairLocation = " ";
		evilFunds = 0;
		
	}
	
	public Customer(String secretLairLocation, String name, double evilFunds) {
		this.secretLairLocation = secretLairLocation;
		this.name = name;
		this.evilFunds = evilFunds;
		
	}
	
	public String toString() {
		return "SecretLairLocation:" + secretLairLocation + "Name: " + name + "EvilFunds: " + evilFunds;
	}
	
	public void addFunds(double addFunds) {
		evilFunds += addFunds;
		
	}

	public void setEvilFunds(double evilFunds) {
		this.evilFunds = evilFunds;
		
	}
	
	public double getEvilFunds() {
		return evilFunds;
	}
	


}
