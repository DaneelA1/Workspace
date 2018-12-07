package tutorialPag;

public class TestInvoice {

	public static void main(String[] args) {
		// Invoice run 1
		
		Customer c = new Customer("island", "Dr evil", 1230.0);
		Invoice in = new Invoice(c);
		in.addToOrder(new Product("flame Thower",123.80), 3);
		in.addToOrder(new Product("sharks", 105.2),2);
		in.addToOrder(new Product("lasers",50.5),20);
		
		runInvoice(c,in); //runs invoice
		
		//invoice run 2
		Customer c1 = new Customer("island", "Dr evil", 1230.0);
		Invoice in1 = new Invoice(c1);
		in1.addToOrder(new Product("flame Thower",123.80), 3);
		in1.addToOrder(new Product("sharks", 105.2),2);
		in1.addToOrder(new Product("lasers",50.5),20);
		
		runInvoice(c1,in1);
		
		//invoice run 3
		Customer c2 = new Customer("island", "Dr evil", 1230.0);
		Invoice in2 = new Invoice(c2);
		in2.addToOrder(new Product("flame Thower",123.80), 3);
		in2.addToOrder(new Product("sharks", 105.2),2);
		in2.addToOrder(new Product("lasers",50.5),20);
		
		runInvoice(c2,in2);
		
		//invoice run 4
		Customer c3 = new Customer("island", "Dr evil", 1230.0);
		Invoice in3 = new Invoice(c3);
		in3.addToOrder(new Product("flame Thower",123.80), 3);
		in3.addToOrder(new Product("sharks", 105.2),2);
		in3.addToOrder(new Product("lasers",50.5),20);
		
		runInvoice(c3,in3);
		
	}
	public static void runInvoice(Customer c, Invoice i) {
		i.printInvoice();

		if(c.getEvilFunds()- i.amountDue() < 0) {
			System.out.println("Evil villian credit union to the rescue!!");	
			c.addFunds(i.amountDue() - c.getEvilFunds());
			System.out.println("New funds total: " + c.getEvilFunds());
		}
		
		i.printInvoice();
		
	}//end runInvoice
	
}//end TestInvoice


