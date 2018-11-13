package tutorialPag;

import java.util.Random; // It imports the Random utility

public class Trial14 {
	public static int monopolyRoll() { // It is a public static int with a variable called monopolyRoll
		Random rand = new Random(); // It is a random function that will make the values random
		int num1 = rand.nextInt(7); // Defines the variable num1 which has a value and equals to rand.nextInt(7) and is random
		int num2 = rand.nextInt(7); // Defines the variable num2 and has a value rand.nextInt(7) and is random
		int num3; // Defines the variable num3
		int num4; // Defines the variable num4
		if(num1 == num2) { // It means if num1 and num2 equal to each other
			return num1 = num2; // It returns num1 and num2 
		}
		
		else { // It will go there if it doesen't meat the if statement
				num3 = rand.nextInt(7); // It's a string that is num3 and the variable has a value of rand.nextInt(7) and it is random
				num4 = rand.nextInt(7); // It's a string that is num4 and the variable has a value of rand.nextInt(7) and it is random
		}return num1 + num2 + num3 + num4; // It returns all the variables after they are all added together

	}
	
	
	public static void main(String[] args) { // This helps run everything in the code
		System.out.println(monopolyRoll()); // It prints out what the value is for monopolyRoll()
		

	}

}
