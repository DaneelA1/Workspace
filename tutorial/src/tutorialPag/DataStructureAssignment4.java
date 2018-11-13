package tutorialPag;

public class DataStructureAssignment4 {

	public static void main(String[] args) {
		String[] names = {"Bob", "Bill", "Jack", "Don", "Max", "Joe", "Chris", "Henry", "George", "Harry"}; // The names of the people
		
		double[] raisedMoney = {100,355,89,456,323.52,65.52,452,265.21,89.89,121}; // Adds the money raised for the people
		
		boolean[] returnedForm = {true,false,false,true,true,true,false,false,true,false}; // Shows which of those people have returned their form or not
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("Name: " + names[i] + " $" + raisedMoney[i] + " form: " + returnedForm[i]);// prints out the names the money that the people raised and if ther returned their forms or not
		}
		//step 2
		double totalAmt = 0; // Stores total amount raised
		for(int i = 0; i < raisedMoney.length; i++) {
			totalAmt += raisedMoney[i]; // Add each index to totalAmt
		}
		double avgRaised = totalAmt / names.length; // calculates avg amount raised
		
		int bigMoneyCount = 0; // Tracks how many poeple raised over $200
		
		System.out.println(); // Used for spacing
		for(int i = 0; i < raisedMoney.length; i++) { 
			// Searching for > 200
			// Counting number of people over $200
			if(raisedMoney[i] > 200) { // Shows whos raisedMoney is greater than 200
				System.out.println(names[i] + " Raised " + raisedMoney[i]);// Prints out the names of the people that raised over $200
				bigMoneyCount++; // Add one to bigMoneyCount
			}
		}
		
		System.out.println(); // Used for spacing
		for(int i = 0; i < returnedForm.length; i++) {
			//searching for people who have not returned their form
			if(returnedForm[i] == false) { // The people that didn't return their forms 
				System.out.println(names[i] + " has not returned form"); // Prints out the names of the people that have not returned their form 
			}
		}
		
		System.out.println(); // Used for spacing
		System.out.println("Total amount raised " + totalAmt); // Prints the "Total amount raised " + totalAmt
		System.out.println("avg amount raised " + avgRaised); // Prints the "avg amount raised " + avgRaised
		
		double lowestAmt; // Declares variable for item tracked
		lowestAmt = raisedMoney[0]; // Assume first index is item searched for
		int nameIndex = 0; // Tracks index of the person with the lowest amount raised
		for(int i = 0; i < raisedMoney.length; i++) { // Find lowest amount raised
			if(raisedMoney[i] < lowestAmt) { // Shows us if the raisedMoney is less than the lowestAmt
				lowestAmt = raisedMoney[i]; // Set new lowest value
				nameIndex = i; // Shows the person with the lowest amount raised
			}

			}
			
		System.out.println("lowest amount raised: $" + lowestAmt + " by " + names[nameIndex]); // Prints out the "lowest amount raised: $" + lowestAmt + " by " + names[nameIndex]
		}//end main
		
		
		
	}


