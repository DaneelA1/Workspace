package tutorialPag;

public class SuperherosArray {

	public static void main(String[] args) { // Helps run everything in the code
		String[] superheroeArray = {" Spiderman"," Batman", " Superman", " Iron man"," Flash"}; // Represents the superheroe names
		boolean[] isHumanArray = {true, true, false, true, true }; // Represents which superheroe is human and which is not
		String[] superPowerArray = {"Webs.","Gadgets.","Strength.","Suits.","Speed."}; // Represents the superheroe powers
		
		System.out.println(superheroeArray[0]); // Prints out the first element in the array
		System.out.println(superheroeArray[superheroeArray.length - 1]); // Prints out the last element in the array
		
		System.out.println(); // Used for spacing
		for(int i = 0; i < superheroeArray.length ; i++) { // Prints array
			System.out.println("Name: " + i + superheroeArray[i] + " \tPower: " + superPowerArray[i] +  " Are they human?: " + isHumanArray[i]); // Prints the "Name: " + i + superheroeArray[i] + " Power: " + superPowerArray[i] +  " Are they human?: " + isHumanArray[i] 
			
		}
			System.out.println(); // Used for spacing
		for(int i = 0; i < isHumanArray.length ; i++) { // It's a for loop for if they are human or not
			System.out.println(superheroeArray[i] + " Has been exposed to couprinite: " +  " Are they human?: " + isHumanArray[i] ); // It print all the heros have been exposed to Couprinite
			if(isHumanArray[i] == false) { // If the if statement is false The superheroe will lose all of his power
				System.out.println("They have lost their power since they are non-human which turns into Power: NONE"); // It prints They have lost their power since they are non-human which turns into Power: NONE
				System.out.println(); // Used for Spacing
			}
			else { // The else statement is here if the superheroes are human
				System.out.println("They still have their power since they are still human. " + "\tPower: " + superPowerArray[i]); // It prints They still have their power since they are still human. and the superheros power
				System.out.println(); // Used for Spacing
			}
		
			
			
		}
			
	
		
			
	}

}
