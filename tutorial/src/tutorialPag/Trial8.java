package tutorialPag;

public class Trial8 {

	public static void main(String[] args) {
		int weekday = 5; // Defines the variable weekday and has a value
		boolean holiday = false; // Defines the variable holiday and has a value of false
		int dayOfTheWeek; // Defines the variable dayOfTheWeek
		if (!holiday && weekday <= 5 && weekday > 0) { // It tells us that the holiday and weekday is less than or equal to 5, and if the weekday is greater than 0
			System.out.println("Wake up at 7:00"); // Prints out Wake up at 7:00
		} else { // Prints another function if the values are different
			System.out.println("Sleep in!"); // Prints out Sleep in!
		}
	}

}
