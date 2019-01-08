package tutorialPag;

import java.util.Scanner; // It imports the Scanner


public class DataStructuresFinalProjectHangman {
	
	public static String word1() {
		Scanner input1 = new Scanner(System.in);// This prompts scanner for input
		System.out.println("Enter a word for player 2 to guess:");// It asks to enter a word
		String word = input1.nextLine();// This stores to input to word
		return word;// This returns the word
	}
	static String word = word1();// It stores word1() to word
	public static String letters = new String(new char[word.length()]).replace("\0", "*");// The places "*" for each letter in the word
	public static int AmtGuesses = 0;// It sets AmtGuesses to 0
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);// A scanner 
		while (AmtGuesses < 6 && letters.contains("*")) {// The limits the amount of guesses
			System.out.println("Guess a letter:");// It prints, Guess a letter
			System.out.println(letters);// This prints the letters that the person guesses into the length of the 
			String guess = input.next();// This prompts for input
			hang(guess);// This prints the associated hangman image for the amount of guesses
		}
		input.close();
	}
	public static void hang(String guess) { // A public static void hang with a parameters called String guess
		String newletters = ""; // A String called new letters which equals ""
		for (int i = 0; i < word.length(); i++) { // It checks the word length
			if (word.charAt(i) == guess.charAt(0)) { // An if statement that says if the word is equal to the guess
				newletters += guess.charAt(0); // The newltters are added and being equal to the guess
			} else if (letters.charAt(i) != '*') { // An else if statement if the letters does equal to the value
				newletters += word.charAt(i); // The newletters is be added and being equal to the word
			} else { // This else statement is here if the if and else if statements are not met
				newletters += "*"; // The newletters are being added to or equal to the value
			}
		}
		if (letters.equals(newletters)) { // The if statement is here if the letters of the player equals to the newletters
			AmtGuesses++; // The amountguesses are being added
			hangmanDrawing(); // This creates the hangman drawing when your guessing, the more you guess wrong, the more the drawiing will grow
		} else { // The else statement is here if the if statement is not met
			letters = newletters; // the letters which equals the newletters
		}
		if (letters.equals(word)) { // When all the letters that were guessed were correct it forms the word
			System.out.println("Congratulations you won! The word was: " + word); // Prints out Congratulations you won!, and what the word was
		}
	}
	public static void hangmanDrawing() {
		if (AmtGuesses == 1) {// This is the drawing for when there is one wrong guess
			System.out.println("Wrong! Try again:");// This prints a wrong guess message
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("___|___");
			System.out.println();
		}
		else if (AmtGuesses == 2) {// This is the drawing for the second wrong guess
			System.out.println("Wrong! Come on, you're better than this....:");// A wrong guess message
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		else if (AmtGuesses == 3) {// A third wrong guess drawing
			System.out.println("Ur trash!");// This insults player...
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
		}
		else if (AmtGuesses == 4) {// A fourth wrong guess hangman drawing
			System.out.println("My guy, try again:");// This instructs player to try again 
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		else if (AmtGuesses == 5) {// This runs after fifth wrong attempt
			System.out.println("Wrong guess, try again:");// It prints, "wrong guess, try again:"
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		else if (AmtGuesses == 6) {// This is the last drawing for the sixth and final attempt
			System.out.println("GAME OVER! Nice try. YOU LOST!");// It informs the player that they have lost and killed the stick man... :(
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			System.out.println("The word was: " + word);// It prints out what the right answer was
		} 
	}
}

