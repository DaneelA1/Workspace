package tutorialPag;

public class LineItem {
	
	private int qty;
	private Product theProduct;
	
	
	public LineItem() {
		qty = 0;
	}
	
	/**
	 * 
	 * @param theProduct
	 * @param qty
	 */
	public LineItem(Product theProduct, int qty) {
		this.theProduct = theProduct;
		this.qty = qty;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getQty() {
		return qty;
	}
	
	/**
	 * 
	 * @return
	 */
	public Product getTheProduct() {
		return theProduct;
	}
	
	
	public String toString() {
		return "Product " + theProduct + " Qty: " + qty;
	}
	
}
