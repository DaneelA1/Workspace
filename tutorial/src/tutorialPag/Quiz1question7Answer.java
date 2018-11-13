package tutorialPag;

public class Quiz1question7Answer {
	public static boolean isSingleDigit(int number) { // The main variable that it returns
		if (number  >=  -9 && number <= 9) { // It says if the number variable is greater than or equal to -9 or if the number is less than or equal to 9
			return true; // It returns the true if the if statement is true
			
		}
		else { // It will go here if the if statement wasn't met
		    return false; // It returns the false if the if statement is false
 		}
 }//end isSingleDigit
	public static void main(String[] args) {
		System.out.println(isSingleDigit(4)); // Prints out (isSingleDigit(4))
		System.out.println(isSingleDigit(45)); // Prints out (isSingleDigit(45))
		System.out.println(isSingleDigit(-3)); // Prints out (isSingleDigit(-3))

		
	}// end public static void main

}// end public Quiz1question7Answer
