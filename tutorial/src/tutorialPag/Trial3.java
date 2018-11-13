package tutorialPag;

public class Trial3 {

	public static void main(String[] args) {
		
String firstName; // Defines the variable firstName
	firstName = "Daneel"; // The value for the firstName
	
String lastName; // Defines the variable lastName
	lastName = "Anoor."; // The value for the lastName
	
String fullName; // Defines the fullName
	fullName = firstName + " " + lastName; // The values of both the firstName and the lastName
	
	System.out.println("Hello my name is" + " " + fullName + " " + "There are" + " " + (fullName.length() - 2) + " " + "letters in my name.");
		// Prints out the message, the fullName, and the amount of letters in the fullName
		
	}

}
