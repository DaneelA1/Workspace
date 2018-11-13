package tutorialPag;

public class Trial10 {
	
public static double absoluteValue(double x) { // It calls the variable absoluteValue and has a value
			if(x < 0) { // This if statement tells us the value in x less than 0
				return -x; // It will return x if its less than 0
			} else { // It will go to the else statement if it does not meet the if statement
				return x; // It will return x if its greater than 0
			}
		}

	public static void main(String[] args) { // This helps run everything in the code
		

absoluteValue(5); // This calls the absoluteValue which has a value of 5
System.out.println(absoluteValue(5)); // This will print out the absoluteValue with whatever the value is 

	}

}

