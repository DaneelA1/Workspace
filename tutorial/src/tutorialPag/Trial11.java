package tutorialPag;

public class Trial11 {
	
	public static double calculateTip(double x) { // This calls the variable calculateTip and has a value
		double mealCost = x * 0.15; // This multiplies the value with 0.15
		return mealCost; // It returns the variable mealCost
	
	}	
	public static void main(String[] args) { // This runs everything in the code

calculateTip(100); // This calls the variable calculateTip which has a value of 100
System.out.println(calculateTip(100)); // This prints out the value of calculateTip

	}

}
