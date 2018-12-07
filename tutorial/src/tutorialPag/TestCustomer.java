package tutorialPag;

public class TestCustomer {

	public static void main(String[] args) {
		
		Customer theCustomer = new Customer();
		Customer theCustomer1 = new Customer("Joe", "Mcdonalds", 15);
		
		System.out.println(theCustomer.toString());
		System.out.println(theCustomer1.toString());
		
		System.out.println();
		
		Product theProduct = new Product();
		Product theProduct1 = new Product("Knife", 30);
		Product theProduct2 = new Product("Axe", 50);
		
		System.out.println(theProduct1.toString());
		System.out.println(theProduct2.toString());
		
		System.out.println();
		
		LineItem Item = new LineItem();
		LineItem Item2 = new LineItem(new Product("vegetables ", 5), 3);
		                 
		
		System.out.println(Item2.toString());
		

	}

}
