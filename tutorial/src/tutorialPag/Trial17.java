package tutorialPag;

import java.util.Random; // It imports the random utility

public class Trial17 {
	
	public static int monopolyRoll() { // It's a public static int with a variable called monopolyRoll
		Random rand = new Random(); // It is a random function that will make the values random
		int num1 = rand.nextInt(6) + 1; //rand.nextInt creates a random number between a set parameter (in this case being 1 to 6)
		int num2 = rand.nextInt(6) + 1;	//rand.nextInt creates a random number between a set parameter 
		int num3; // Defines the variable num3
		int num4; // Defines the variable num4
		int num5; // Defines the variable num5
		int num6; // Defines the variable num6
		int numHolder2 = 0; // Defines the variable numHolder2 which equals to 0
		int numHolder1 = 0; // Defines the variable numHolder1 which equals to 0
		if (num1 == num2) { //If statement that checks if num1 is equal to num2
			num3 = rand.nextInt(6) + 1; //
			num4 = rand.nextInt(6) + 1; //
			if (num3 == num4) { //If statement that checks if num3 is equal to num4
				num5 = rand.nextInt(6) + 1; //
				num6 = rand.nextInt(6) + 1; //
				while (num5 == num6) { //While statement that continues to run while the "rolled" values of num5 and num6 are the same
					numHolder1 = numHolder1 + num5;
					numHolder2 = numHolder2 + num6;
					num5 = rand.nextInt(6) + 1; //rand.nextInt creates a random number between a set parameter (in this case being 1 to 6)
					num6 = rand.nextInt(6) + 1;} // //rand.nextInt creates a random number between a set parameter (in this case being 1 to 6)
				return num1 + num2 + num3 + num4 + numHolder1 + numHolder2; // This returns the variables num1 + num2 + num3 + num4 + numHolder1 + numHolder2
			}else { // It goes to the else statement if it doesn't meet the if statement
				return num1 + num2 + num3 + num4; // It returns the variables num1 + num2 + num3 + num4
			}
		}else { // It goes to this else statement if it doesn't meet if statement and the other statement
			return num1 + num2;} // It returns the variables num1 + num2
		}

	

	public static void main(String[] args) { // This helps run everythingin the code
		System.out.println(monopolyRoll()); //Prints out the value returned by the "monopolyRoll" function

		

	}

}
