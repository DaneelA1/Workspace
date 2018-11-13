package tutorialPag;
import java.util.Scanner;

public class InterviewAssignment {
	        // Gaming store
			// Gift cards/game cards
			// gaming chairs
			// gaming headphones
			// gaming keyboards
			// gaming mouses
			// gaming computers
			// gaming mousepad's
			// game discs
			// consoles
			// Apparels/toys
	  		//
	public static void main(String[] args) {
		Scanner scanWords = new Scanner(System.in); // Scanner object to take in Words
		Scanner scanNums = new Scanner(System.in); // Scanner object that takes in Nums
		
		double GiftcardsPrice = 50; // Price of Gift cards
		double GamingchairsPrice = 120; // Price of Gaming chairs
		double GamingheadphonesPrice = 80; // Price of Gaming headphones
		double GamingkeyboardsPrice = 100; // Price of Gaming keyboards
		double GamingmousesPrice = 70; // Price of Gaming mouses
		double GamingComputerPrice = 700; // Price of Gaming Computer
		double GamingmousepadsPrice = 30; // Price of Gaming mouse pads
		double GamediscsPrice = 80; // Price of Game discs
		double ConsolesPrice = 400; // Price of Consoles
		double ApparelsandtoysPrice = 20; // Price of Apparels and toys
		double price = 0; // Total price of sale
		final double TAX = 0.05; // The tax for the price
		int itemNum; // It calls the variable itemNum

	
		
		System.out.print("What is your name?: " ); // Prints out what is your name
		String name = scanWords.nextLine(); // To declare name variable and store input
		
		System.out.println("\nWelcome " + name + " to Marcs' Gaming store!" ); // Prints out welcome and the name that you put to Marcs Gaming store
		//menu items
		do { // It evaluates the expression at the bottom
		System.out.println("\nWhat would you like to buy?\n" // It prompts user the user to pick what they buy
				 + "0. Exit\n"
				 + "1. Gift cards Price: $50\n"
				 + "2. Gaming chairs Price: $120\n"
				 + "3. Gaming headphones Price: $80\n"
				 + "4. Gaming keyboards Price: $100\n"
				 + "5. Gaming mouses Price: $80\n"
				 + "6. Gaming computers Price: $700\n"
				 + "7. Gaming mousepad's Price: $30\n"
				 + "8. Game discs Price: $80\n"
				 + "9. Consoles Price: $400\n"
				 + "10. Apparels/toys Price: $20");
        itemNum = scanNums.nextInt(); // It calls the variable itemNum which has a scanNu.nextInt as its value
		
		System.out.println("How many do you want? "); // Prints out How many do you want?
		
		int qty = scanNums.nextInt(); //It calls the variable qty which has scanNums.nextInt as the value
		
		if(itemNum == 1) { // The if statement is if the user picks option 1
			price += GiftcardsPrice * qty; // The price of the gift cards then multiplied if its more than amount of the item
		}
		else if(itemNum == 2) { // The else if statement is here if the user picks option 2
			price += GamingchairsPrice * qty; // The price of the Gaming chairs then multiplied if its more than amount of the item
		}
		else if(itemNum == 3) { // The else if statement is here if the user picks option 3
			price += GamingheadphonesPrice * qty; // The price of the Gaming headphones then multiplied if its more than amount of the item
		}
		else if(itemNum == 4) { // The else if statement is here if the user picks option 4
			price += GamingkeyboardsPrice * qty; // The price of the Gaming keyboards then multiplied if its more than amount of the item
		}
		else if(itemNum == 5) { // The else if statement is here if the user picks option 5
			price += GamingmousesPrice * qty; // The price of the Gaming mouses then multiplied if its more than amount of the item
		}
		else if(itemNum == 6) { // The else if statement is here if the user picks option 6
			price += GamingComputerPrice * qty; // The price of the gaming computers then multiplied if its more than amount of the item
		}
		else if(itemNum == 7) { // The else if statement is here if the user picks option 7
			price += GamingmousepadsPrice * qty; // The price of the Gaming mouse pads then multiplied if its more than amount of the item
		}
		else if(itemNum == 8) { // The else if statement is here if the user picks option 8
			price += GamediscsPrice * qty; // The price of the Game discs pads then multiplied if its more than amount of the item
		}
		else if(itemNum == 9) { // The else if statement is here if the user picks option 9
			price += ConsolesPrice * qty; // The price of the Consoles then multiplied if its more than amount of the item
		}
		else if(itemNum == 10) { // The else if statement is here if the user picks option 10
			price += ApparelsandtoysPrice * qty; // The price of the Apparels/Toys then multiplied if its more than amount of the item
		}
		else { // THis else block is here if user does not meet all else if options
			System.out.println("Sorry there is no option for that"); // Prints out Sorry there is no option for that
			
		}
    } while(itemNum != 0);//end of do/while	
		
		System.out.println("Your total is " + price + "dollars"); // It tells the user total price
		System.out.println("Tax is: " + price * TAX); // It prints the price with the tax
		double totalPrice  = price * TAX + price; // The price is multiplied with tax plus is added again with tax
		System.out.println("Total with tax is: " + totalPrice); // It prints out the total price
		System.out.println("Thank you for buying the product, come again anytime"); // It tells the user that they are done buying things in the store.
		

	}//main

}//class
