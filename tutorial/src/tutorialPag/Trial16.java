package tutorialPag;

public class Trial16 {
	
	public static int yearsTilOneMillion(double initialBalance) { // It's a public static int that has a variable called yearsTilOneMillion which has a value of double initialBalance
		double percentage = initialBalance / 100 * 5; // The double defines the percentage and it equals to initialBalance that is divided by 100 and multiplied by 5
		int years = 0; // Defines the variable years which equals to the value of 0
		while(initialBalance < 1000000) { // It checks if the initialBalance is less than 1000000
			initialBalance = initialBalance * percentage; // Its a string called initialBalance that equals to initialBalance and is multiplied by percentage
			years = years + 1; // Its a string called years which equals to years and is added by 1
			
		} return years; // Returns the variable years
	}

	public static void main(String[] args) { // This helps run everything in the code
		double balanceInitial = 50.00; // The double defines balanceInitial that equals to whatever the value is
		System.out.println(yearsTilOneMillion(balanceInitial)); // Prints out the value of (yearsTilOneMillion(balanceInitial))
		

	}

}
