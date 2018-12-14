package Invoice;

public class Product {
	
	private String name; // The name of the product
	private double price; // The price of the product
	
	/**
	 * A constructor for Product to set default values
	 */
	public Product() { // It sets the default values of the Product method
		name = " ";
		price = 0;
	}
	
	/**
	 * It's a constructor to provide the variables with values using the parameter values
	 * @param name - this is the name of product
	 * @param price - this is the price of product
	 */
	public Product(String name, double price) { // This will set the values of each variable using the given parameters
		this.name = name;
		this.price = price;
		
	}//end constructor
	
	/**
	 * this prints out the price of the product
	 * @return - this is the value of price
	 */
	public double getPrice() { // This will return the value of the variable price
		return price;
		
	}
	
	/**
	 * this will print out the products information
	 */
	public String toString() { // This will return the values of every variable
		return ("Product: " + name + " Price: " + price);
	}//end toString
	
}//end class Product
