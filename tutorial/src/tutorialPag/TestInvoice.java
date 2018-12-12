package tutorialPag;

public class TestInvoice {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Invoice run 1
		
		Customer c = new Customer("island", "Dr evil", 1230.0);
		Invoice in = new Invoice(c);
		in.addToOrder(new Product("flame Thower",123.80), 3);
		in.addToOrder(new Product("sharks", 105.2),2);
		in.addToOrder(new Product("lasers",50.5),20);
		
		runInvoice(c,in); //runs invoice
		
		//invoice run 2
		Customer c1 = new Customer("fortress of solitude", "Superman", 5000.0);
		Invoice in1 = new Invoice(c1);
		in1.addToOrder(new Product("Supermans's suit",100), 1);
		in1.addToOrder(new Product("Superman's hair", 50), 3);
		in1.addToOrder(new Product("Superman action figure", 40.25), 2);
		in1.addToOrder(new Product("Superman phone cases", 15.58), 1);
		in1.addToOrder(new Product("Superman tshirts", 32.78), 2);
		
		runInvoice(c1,in1); //runs invoice
		
		//invoice run 3
		Customer c2 = new Customer("Avengers hq", "Captain America", 20000000.00);
		Invoice in2 = new Invoice(c2);
		in2.addToOrder(new Product("Captain America's shield", 50.00), 2);
		in2.addToOrder(new Product("Captain Americas's suit", 150.25), 1);
		in2.addToOrder(new Product("Captain America's helmet", 25.62), 2);
		in2.addToOrder(new Product("Captain America action figure", 32.25), 4);
		in2.addToOrder(new Product("Captain America motorcylce", 10000.00), 2);
		
		
		runInvoice(c2,in2); //runs invoice
		
		//invoice run 4
		Customer c3 = new Customer("New York", "Spider-Man", 120.50);
		Invoice in3 = new Invoice(c3);
		in3.addToOrder(new Product("Spider-Man's suit ",62.40), 1);
		in3.addToOrder(new Product("Spider-Man's web toy", 35.30), 1);
		in3.addToOrder(new Product("Spider-Man action figure", 23.10), 2);
		in3.addToOrder(new Product("Spider-Man game disc", 80.00), 1);
		in3.addToOrder(new Product("Spider-Man socks", 21.21), 2);
		
		runInvoice(c3,in3); //runs invoice
		
	}
	/**
	 * 
	 * @param c
	 * @param i
	 */
	public static void runInvoice(Customer c, Invoice i) {
		i.printInvoice();

		if(c.getEvilFunds()- i.amountDue() < 0) {
			System.out.println("Evil villian credit union to the rescue!!");	
			c.addFunds(i.amountDue() - c.getEvilFunds());
			System.out.println("New funds total: " + c.getEvilFunds());
			
			i.printInvoice();
		}
		
		
	}//end runInvoice
	
}//end TestInvoice


