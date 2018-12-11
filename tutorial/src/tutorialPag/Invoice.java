package tutorialPag;
import java.util.ArrayList;
public class Invoice {
	
	private Customer theCustomer;
	public ArrayList<LineItem> Item = new ArrayList<>();
	double amountDue = 0;
	
	
	
	public Invoice(Customer theCustomer) {
		this.theCustomer = theCustomer;
	}
	
	public void addToOrder(Product theProduct, int qty ) {
		Item.add(new LineItem(theProduct, qty));
		
	}
	
	public void  printInvoice() {
		for(int i = 0; i < Item.size(); i++) {
			System.out.printf(Item.get(i) + "Total $%.2f" , (Item.get(i).getTheProduct().getPrice()* Item.get(i).getQty()));
			System.out.println();
		}
		
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
	
	public boolean canAfford(Customer theCustomer) {
		if(amountDue() <= theCustomer.getEvilFunds()) {
			return true;
			
		}
		else {	
			return false;
		
		}
	}
	
	public Customer getTheCustomer() {
		return theCustomer;
	}
	
	public double amountDue() {
		double totalPrice = 0;
		for(int i = 0; i < Item.size(); i++) {
			totalPrice = totalPrice + Item.get(i).getTheProduct().getPrice()* Item.get(i).getQty();
		}
		return totalPrice; // Returns the total amount due for this order
		
	}
	

}
