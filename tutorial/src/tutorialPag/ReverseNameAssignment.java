package tutorialPag;

import java.util.Scanner; // It imports the Scanner

public class ReverseNameAssignment {

	public static void main(String[] args) {
		String originalName, reverse = ""; // It takes in the original name, which is the name that is being reversed
	      Scanner in = new Scanner(System.in); // Scans the name 
	     
	      System.out.println("Enter a name to reverse"); // This prints out Enter a name to reverse
	      originalName = in.nextLine(); // The original which takes it to the nextLine
	     
	      int length = originalName.length(); // Defines length which then equals to the original.length() which has a value
	     
	      for (int i = length - 1 ; i >= 0 ; i--) // The for defines everything in the brackets (int i = length - 1 ; i >= 0 ; i--), the int defines i
	         reverse = reverse + originalName.charAt(i); // This function will start to reverse the original name
	      
	      System.out.println("Reverse of the name:\n" + reverse); // This will print out the reversed name
			

	}

}
