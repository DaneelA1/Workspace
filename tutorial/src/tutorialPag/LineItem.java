package tutorialPag;

public class LineItem {
	
	private int qty;
	private Product theProduct;
	
	public LineItem() {
		qty = 0;
	}
	
	public LineItem(Product theProduct, int qty) {
		this.theProduct = theProduct;
		this.qty = qty;
	}
	
	public int getQty() {
		return qty;
	}
	
	public Product getTheProduct() {
		return theProduct;
	}
	
	public String toString() {
		return "Product " + theProduct + " Qty: " + qty;
	}
	
}
