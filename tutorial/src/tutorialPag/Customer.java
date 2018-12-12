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
	
	/**
	 * 
	 * @param secretLairLocation
	 * @param name
	 * @param evilFunds
	 */
	public Customer(String secretLairLocation, String name, double evilFunds) {
		this.secretLairLocation = secretLairLocation;
		this.name = name;
		this.evilFunds = evilFunds;
		
	}
	
	/**
	 * 
	 * @return secretLairLocation
	 * @return name
	 * @return evilFunds
	 */
	public String toString() {
		return "SecretLairLocation:" + secretLairLocation + "Name: " + name + "EvilFunds: " + evilFunds;
	}
	
	/**
	 * 
	 * @param addFunds
	 */
	public void addFunds(double addFunds) {
		evilFunds += addFunds;
		
	}
	
	/**
	 * 
	 * @param evilFunds
	 */
	public void setEvilFunds(double evilFunds) {
		this.evilFunds = evilFunds;
		
	}
	
	/**
	 * 
	 * @return evilFunds
	 */
	public double getEvilFunds() {
		return evilFunds;
	}
	


}
