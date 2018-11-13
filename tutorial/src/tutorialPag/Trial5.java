package tutorialPag;

public class Trial5 {

	public static void main(String[] args) {
		boolean canSeePlayer = true; // The boolean calls the variable canSeePlayer and it equals true 
		boolean playerPoweredup = true; // The boolean calls the variable playerPoweredup and it equals true
		if (canSeePlayer == true) { // The if statement tells the canSeePlayer if it's either a true or false statement
			if(playerPoweredup == false) { // The if statement tells the playerPoweredup if it's either a true or false statement
				System.out.println("Attack!"); // Prints out the attack value
			} else { // It executes the block if the condition is true or false
				System.out.println("Run away!"); // Prints out the run away value
			}
		} else { // It executes the block if the condition is true or false
			System.out.println("Wander."); // Prints out the wander value
		}
		
		
	}

}
