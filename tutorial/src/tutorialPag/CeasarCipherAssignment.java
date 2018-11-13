package tutorialPag;

import java.util.Scanner; // It imports the scanner 

public class CeasarCipherAssignment {
		static Scanner scanNum = new Scanner(System.in); // Scanner object that takes in Num
		static Scanner scanLine = new Scanner(System.in); // Scanner object that takes in Line
		static String text; // A static string that defines text

		
		public static void CeasarEncrypter(String plainText, int shiftValue) { // A public static void CeasarEncrypter with variables String plainText, int shiftValue
			int textNum = plainText.length(); // Defines textNum which equals to plainText.length() with a value
			plainText = plainText.toLowerCase(); //turns all the letters inside plainText to lowercase
			
			text = ""; // A text string which equals to ""
			
			for(int i = 0; i < textNum; i++) {//continues as long as "i" is less than the number of letters
				char x = (char)(plainText.charAt(i) + shiftValue);//used to shift each letter by the shiftValue
				text = text + x;//adds the shifted letter to text
			}//end for
		}//end CaesarEncrypter
		
		
		public static void CeasarDecrypter(String encryptedText, int shiftValue) { // public static void CeasarDecrypter which has variables taht are called String encryptedText, int shiftValue
			int textNum = encryptedText.length(); // Defines textNum which equals to encryptedText.length 
			encryptedText = encryptedText.toLowerCase(); // A string called encryptedText which equals to encryptedText.toLowerCase
			text = ""; // A text string which equals to ""
			for(int i = 0; i < textNum; i++) {//runs as long as "i" is less than the amount of letters
				char x = (char)(encryptedText.charAt(i) - shiftValue); //shifts the letters by the shiftValue
				text = text + x;//adds the shifted letter to text
			}//end for
		} //end CaesarDecrypter
		
		
		public static void Chooser() { // A public static void Chooser()
			int choice; // The int defines choice
			System.out.println("Which program would you like to use?\n1. Encrypter\n2. Decrypter"); // This prints out Which program would you like to use?\n1. Encrypter\n2. Decrypter
			choice = scanNum.nextInt(); // It takes in the nextInt
			if(choice == 1) {//if user chooses encryption function continue
				String Sverifier = ""; //variable used to verify that user has inputed usable text to encrypt
				int Iverifier = 0; //variable used to verify that user has inputed usable number to shift letters with
				System.out.println("Running Encrypter Program.\nPlease enter the text you want to encrypt."); // Prints Running Encrypter Program.\nPlease enter the text you want to encrypt."
				String plainText = scanLine.nextLine(); // This takes in the nextLine
				if(plainText != Sverifier) { //if user inputed valid text continue
					System.out.println("Now, please enter the amount you wish to shift these letters at."); // Prints "Now, please enter the amount you wish to shift these letters at."
					int shiftValue = scanNum.nextInt(); // Takes in the nextInt
					if(shiftValue != Iverifier) {//if user inputed valid number value continue
						CeasarEncrypter(plainText,shiftValue); // A CeasarEncrypter that takes in plainText,shiftValue
					}//end if
					else {//if user did not input valid number value continue
						System.out.println("You did not input a valid shift value. Returning to menu."); // Prints You did not input a valid shift value. Returning to menu."
						Chooser(); // It calls it
					}//end else
				}//end if
				else {//if user did not input any text continue
					System.out.println("You did not input any text. Returning to menu."); // Prints You did not input any text. Returning to menu."
					Chooser(); // It calls it
				}//end else
			}//end if
			else if(choice == 2) {//if user chooses decryption function continue
				String Sverifier = ""; // A string Sverifier which equals to ""
				int Iverifier = 0; // Defines Iverifier which equals to 0
				System.out.println("Running Decrypter Program.\nPlease enter the text you want to decrypt."); // Prints Running Decrypter Program.\nPlease enter the text you want to decrypt."
				String encryptedText = scanLine.nextLine(); // An encryptedText whihc equals scanLine.nextLine and makes it go to the nextLine
				if(encryptedText != Sverifier) {//if user has entered encrypted text continue
					System.out.println("Now, please enter the amount you wish to shift these letters at."); // Prints "Now, please enter the amount you wish to shift these letters at."
					int shiftValue = scanNum.nextInt(); // Defines shiftValue which equals to scanNum.nextInt
					if(shiftValue != Iverifier) {//if user has entered valid number continue
						CeasarDecrypter(encryptedText,shiftValue); // CeasarDecrypter that takes in encryptedText,shiftValue
					}//end if
					else {//if user did not entered any number continue
						System.out.println("You did not input a valid shift value. Returning to menu."); // Prints "You did not input a valid shift value. Returning to menu."
						Chooser(); // It calls it
					}//end else
				}//end if
				else {//if user did not enter any encrpyted text
					System.out.println("You did not input any text. Returning to menu."); // Prints "You did not input any text. Returning to menu."
					Chooser(); // It calls it
				}//end else
			}//end else if
			else {//if user did not make a valid choice between encrypter and decrypter
				System.out.println("Invalid choice.\nPlease choose a valid option."); // Prints "Invalid choice.\nPlease choose a valid option."
				Chooser(); // It calls it
			}
		}//end Chooser
	

	public static void main(String[] args) { // Runs everything in the code
		Chooser();//runs chooser function
		System.out.println("Your encrypted/decrypted text is: " + text);//prints out the words + the value inside the variable "text"

		

	}// end void main

}// end public class CeasarCipherAssignment
