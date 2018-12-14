package Invoice;

public class Customer {
	
	
	private String secretLairLocation; // The customer's lair location
	private String name; // The name of the customer
	private double evilFunds; // The amount of money the customer has
	
	/**
	 * A constructor for the customer
	 */
	public Customer() { // It sets blank values for the Customer method
		name = " "; 
		secretLairLocation = " ";
		evilFunds = 0;
		
	}//end the constructor default
	
	/**
	 * The constructor for customer
	 * @param secretLairLocation - It's the lair location for the customer
	 * @param name - the name of the customer
	 * @param evilFunds -the amount of money that the customer has
	 */
	public Customer(String secretLairLocation, String name, double evilFunds) { // This will fill the variables with values from the parameters
		this.secretLairLocation = secretLairLocation;
		this.name = name;
		this.evilFunds = evilFunds;
		
	}//end constructor
	
	
	
	/**
	 * this will add funds to evilFunds
	 * @param amount - the amount that is being added to evilFunds
	 */
	public void addFunds(double amount) { // This adds money to evilFunds, by using the value given in the parameters
		this.evilFunds = this.evilFunds + amount;
		
	}//end addFunds
	
	public double getFunds() { // This will return value of evilFunds
		return evilFunds;
		
	}//end getFunds
	
	/**
	 * prints out the customer's information
	 */
	public String toString() { // This returns the values of all the variables in the Customer method
		return ("Location: " + secretLairLocation + " Name: " + name + " Money: " + evilFunds); 
		
	}//end toString


}//end class Customer
