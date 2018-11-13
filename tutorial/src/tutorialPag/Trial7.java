package tutorialPag;

public class Trial7 {

	public static void main(String[] args) {
		int time = 18; // Defines the variable time
		String timeOfDay; // Adds the value of timeOfDay
		if (time >= 5 && time < 12) { // Adds the time for the morning
			timeOfDay = "morning"; // Represents the value morning 
		} else if (time >= 12 && time < 20) { // Adds the times for daytime and for night
			timeOfDay = "daytime"; // Represents the value daytime
		} else { // Runs the other value if the times are different 
			timeOfDay = "night"; // Represents the value of night
		}
		System.out.println(timeOfDay); // Prints out the time of day

	}

}
