package tutorialPag;
import java.util.ArrayList;
public class Invoice {
	
	private Customer theCustomer;
	public ArrayList<LineItem> Item = new ArrayList<>();
	double amountDue = 0;
	
	
	
	public Invoice(Customer theCustomer) {
		this.theCustomer = theCustomer;
	}
	
	public void addToOrder(Product theproduct, int qty ) {
		LineItem L1 = new LineItem(theproduct, qty);
		Item.add(L1);
	}
	
	public void  printInvoice() {
		for(int i = 0; i < LineItem L1.size(); i++) {
			System.out.println(LineItem.get(i) + "Total $%.2f" + .getTheProduct().getPrice()* item.get(i).getQty);
		}
		
	}
	
	public boolean canAfford(Customer theCustomer) {
		return true;
		
	}
	
	public Customer getTheCustomer() {
		return theCustomer;
	}
	
	public double amountDue() {
		return amountDue;
		
	}
	


}
