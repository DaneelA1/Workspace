package tutorialPag;

public class Trial6 {

	public static void main(String[] args) {
		boolean isSnowing = false; // The boolean defines the variable isSnowing, and the true or false statement
		boolean isRaining = true; // The boolean defines the variable isRainging and the true or false statement 
		double temperature = 60.0; // The double defines the variable temperature and value of the degrees
		if (isSnowing || isRaining || temperature < 50.0) { // It performs the functions isSnowing, isRaining, and the temperature < 50.0 if its true or false, or it displays the information 
			System.out.println("Let’s stay home."); // This program prints out, Let's stay home
		} else { // It executes the block if the condition is true or false
			System.out.println("Let’s go out!"); // This program prints out, Let's go out
		}

	}

}
