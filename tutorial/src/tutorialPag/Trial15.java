package tutorialPag;

public class Trial15 {
	
	public static int factorial (int n) { // It's a public static int that has variable called factorial which has a value of whatever the number is 
		int x = 1; // Defines the variable x that equals to the number 1   
		int y = 1; // Defines the variable y that equals to the number 1
		
		while (x <= n) { // Executes the next block of statements
			y = y * x; // A string that is y which equals to y multiplied by x
			x = x + 1; // A string that is x which equals to x added by 1
	    }return y; // Returns the variable y
		
	}
	public static void main(String[] args) { //This helsp run everything in the code
		int number = 7; // Defines the variable number with whatever the value is
		System.out.println(factorial(number)); //Prints out the value of (factorial(number))
		


	}

}
