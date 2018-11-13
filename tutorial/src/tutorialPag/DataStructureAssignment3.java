package tutorialPag;
import java.util.Scanner; // It imports the scanner
public class DataStructureAssignment3 {
	public static double finalPrice = 0; // It checks the final price
	public static void main(String[] args) {
        
		Scanner sW = new Scanner(System.in); // Scans words
		Scanner sN = new Scanner(System.in); // Scans numbers
		
		double secretDiscount = 0; // It is the secret discount, will be updated if user inputs "-1" on product choice
		String[] Products = {"Apple", "Banana", "Orange", "Strawberry", "Tomato", "Lemon", "Watermelon", "Pineapple", "Mango", "Peaches" }; // The array of product choices
		double[] Prices = {4.53, 1.61, 3.91, 1.5, 1.48, 4.97, 3.97, 3.47, 1.27, 2.30}; // The prices of the products
		int[] Quantities = {0,0,0,0,0,0,0,0,0,0}; // The qty of products bought
		int shopLoop; // Its used to put product choice back up if user wants to buy more items
		
		do { // This runs the code inside brackets as long as the while statement is not fulfilled
		for(int i = 0; i < Products.length; i++) { // It lists all products w/ their prices
		System.out.println(i + ". " + Products[i] + " $" + Prices[i]); // This prints out the menu
		}//end for
		
		System.out.println("Please enter the number of the product you want to purchase."); // It tells the user to type in the number of the product they would like to buy
		int productChoice = sN.nextInt(); // The user input updates productChoice
		if(productChoice == -1) { // This unlocks secret discount
			secretDiscount = 0.10; // It sets the secret discount to 0.10
			System.out.println("Secret discount is now being used."); // This tells user that the secret discount is now in effect for the products they buy
		}//end if
		
		if(productChoice != -1) { // If the product choice is not -1 continue
		System.out.println("How many of the product: " + Products[productChoice] + ", would you like to buy?"); // It will asks user how much of the product they would like to buy
		int qty = sN.nextInt(); // The user input updates qty
		Quantities[productChoice] = qty; // It stores qty value inside the specified index of the quantities array
		}//end if
		
		System.out.println("Would you like to continue shopping? \n1 = Yes\n2 = No"); // It asks user if they want to continue shopping
		shopLoop = sN.nextInt(); // The user input updates shopLoop
		
		} while(shopLoop != 2); // While user continues to not input 2 (to exit shopping), it will run all the code inside the "do"
		for(int i = 0; i < Products.length; i++) { // The bill shown after all user exits shop
			if(Quantities[i] > 0) { // If the user bought more than 0 of the product continue
				double totalPrice = Prices[i] * Quantities[i];//This calculates the sum of price
				finalPrice += Prices[i] * Quantities[i]; // It calculates the price
				if(secretDiscount == 0.10) { // If they used the secret discount continue
					double discount = totalPrice * secretDiscount; // It multiplies total price by discount
					totalPrice = totalPrice - discount; //It updates price, subtracts price by discount value
					finalPrice = finalPrice - discount;
				}//end if
				System.out.println("Product: " + Products[i] + " Price: $" + Prices[i] + " Num Bought: " + Quantities[i] + " Total: " + totalPrice); //It displays the bill
			}//end if 
		}//end for
		System.out.println();
		System.out.println("Total: " + finalPrice); // Prints out the total price



	}

}
