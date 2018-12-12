package tutorialPag;
import java.util.ArrayList;
public class Invoice {
	
	private Customer theCustomer; // A variable using the customer method
	public ArrayList<LineItem> Item = new ArrayList<>(); // An ArrayList to hold the items being bought + their quantities
	double amountDue = 0; //
	
	/**
	 * A constructor for customer Invoice
	 * @param theCustomer - the customer for which the invoice is meant for
	 */
	public Invoice(Customer theCustomer) { // It fills theCustomer variable with parameter values
		this.theCustomer = theCustomer;
	}
	
	/**
	 * It adds a desired product to the customer's order
	 * @param theProduct 
	 * @param qty
	 */
	public void addToOrder(Product theProduct, int qty ) { //It adds an item to the ArrayList
		Item.add(new LineItem(theProduct, qty));
		
	}
	
	/**
	 * 
	 */
	public void  printInvoice() {
		for(int i = 0; i < Item.size(); i++) {
			System.out.printf(Item.get(i) + "Total $%.2f" , (Item.get(i).getTheProduct().getPrice()* Item.get(i).getQty()));
			System.out.println();
		}
		
		/**
		 * 
		 */
		if(amountDue() <= theCustomer.getEvilFunds()) {
			System.out.println("Order has been approved!");
			
		}
		else {
			double fundShortage = theCustomer.getEvilFunds() - amountDue();
			fundShortage = fundShortage * -1;
			System.out.printf("You can't afford that item. You are short by $%.2f", fundShortage);
			System.out.println();
		}
		
	}
	
	/**
	 * 
	 * @param theCustomer
	 * @return
	 */
	public boolean canAfford(Customer theCustomer) {
		if(amountDue() <= theCustomer.getEvilFunds()) {
			return true;
			
		}
		else {	
			return false;
		
		}
	}
	
	/**
	 * 
	 * @return theCustomer
	 */
	
	public Customer getTheCustomer() {
		return theCustomer;
	}
	
	/**
	 * 
	 * @return totalPrice
	 */
	public double amountDue() {
		double totalPrice = 0;
		for(int i = 0; i < Item.size(); i++) {
			totalPrice = totalPrice + Item.get(i).getTheProduct().getPrice()* Item.get(i).getQty();
		}
		return totalPrice; // Returns the total amount due for this order
		
	}
	

}
