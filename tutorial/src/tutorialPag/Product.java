package tutorialPag;

public class Product {
	
	private String name;
	private double price;
	
	
	public Product() {
		name = " ";
		price = 0;
	}
	
	/**
	 * 
	 * @param name
	 * @param price
	 */
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		
	}
	
	/**
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
		
	}
	
	/**
	 * 
	 * @return price
	 */
	public double getPrice() {
		return price;
		
	}
	
	/**
	 * 
	 * @return name
	 * @return price
	 */
	public String toString() {
		return "Name: " + name + "Price: " + price;
	}
	
	
}
