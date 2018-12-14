package Invoice;

import java.util.ArrayList;

public class Invoice {
	
	private Customer theCustomer; // A variable using the customer method
	public ArrayList<LineItem> Item = new ArrayList<>(); // An ArrayList that hold the items being bought + their quantities
	
	/**
	 * A constructor for customer Invoice
	 * @param theCustomer - the customer for which the invoice is meant for
	 */
	public Invoice(Customer theCustomer) { // It fills theCustomer variable with parameter values
		this.theCustomer = theCustomer;
	}//end constructor default
	
	/**
	 * It adds a desired product to the customer's order
	 * @param theProduct 
	 * @param qty
	 */
	public void addToOrder(Product product, int qty ) { //It adds an item to the ArrayList
		Item.add(new LineItem(qty ,product));
		
	}//end addToOrder
	
	/**
	 * It prints out the total price of the customer's order + if they can buy it with their current funds or not
	 */
	public void  printInvoice() {
		System.out.println("Products:");
		for(int i = 0; i < Item.size(); i++) { // This will prints out each item, the quantity being bought and its individual price, along with the total price (which will be rounded down to first two decimal places)
			System.out.printf(Item.get(i) + "Total $%.2f" , (Item.get(i).getProduct().getPrice()* Item.get(i).getQty()));
			System.out.println();
			
		}//end for
		
		if(amountDue() <= theCustomer.getFunds()) { // If the customer's funds is greater than or equal to the total price it continues
			System.out.println("Order has been approved!");
			
		}//end if
		else {
			double fundShortage = theCustomer.getFunds() - amountDue(); // It calculates the difference in funds
			fundShortage = fundShortage * -1; // It converts the negative number into a positive number
			System.out.printf("You can't afford that item. You are short by $%.2f", fundShortage); // This prints out the difference in funds (whihc is rounded down to first two decimal places)
			System.out.println();
		}//end else
		
	}
	
	/**
	 * This checks if the customer can afford their entire order
	 * @param theCustomer - it's the customer and their order
	 * @return - it will be true if the customer can afford the order, false otherwise
	 */
	public boolean canAfford(Customer theCustomer) { // This checks if the customer can buy all the items in the ArrayList
		if(amountDue() <= theCustomer.getFunds()) { // If the customer's funds is greater than or equal to the total price it continues
			return true;
			
		}
		else { // If the customer's funds are less than the total price this continues
			return false;
		
		}
	}//end canAfford
	
	/**
	 * 
	 * @return theCustomer
	 */
	
	public Customer getTheCustomer() {
		return theCustomer;
	}
	
	/**
	 * This calculates the total price of the customer's order
	 * @return - the total value of all items in the customer's order
	 */
	public double amountDue() { // This will return the total price of all the items in the ArrayList
		double totalPrice = 0;
		for(int i = 0; i < Item.size(); i++) { // This is a loop that multiplies the product that is price by the quantity that is being bought, and then is added to the current value of the totalPrice
			totalPrice = totalPrice + Item.get(i).getProduct().getPrice()* Item.get(i).getQty();
		}//end for
		
		return totalPrice; // Returns the total amount due for this order
		
	}//end amountDue
	

}//end class Invoice
