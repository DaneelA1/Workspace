package tutorialPag;

public class Trial13 {
	public static double FarentoCel(double temp) // This public static double FarentoCel with a value of double temp
	{
		double faren = temp; // The double defines faren and it equals to temp
		double cel = (faren - 32) * 5/9; // The double function defines cel and it equals to the formula
		return cel; // It returns the variable cel
		
	}
	
	public static void printTemp(double temp) // The public static void printTemp and takes the double temp
	{
		double faren = temp; // The double defines faren and it equals to temp
		System.out.println("F: " + faren); // Prints out the temp value
		
		double cel = FarentoCel(faren); // The double function defines cel, with a value of FarentoCel(faren)
		System.out.println("C:"  + cel); // Prints out the FarentoCel(faren) value
		
	}


	public static void main(String[] args) { // Runs everything in the code

		printTemp(60); // Prints the temp value in fahrenheit and in celsius
	}

}
