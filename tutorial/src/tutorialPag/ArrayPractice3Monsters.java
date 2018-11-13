package tutorialPag;
import java.util.Scanner;

public class ArrayPractice3Monsters {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] monster = {"Skeleton", "Raven", "Monka S", "Ninja", "Pumpkin", "Casper", "Player"};
		
		System.out.println("Enter player name: "); // Prompt
		monster[monster.length - 1] = "Player: " + input.nextLine();
		
		int[] coins = new int[monster.length];
		
		//add random number of coins
		for(int i = 0; i < monster.length; i++) {
			coins[i] = (int)(Math.random() * 8) + 2;
			System.out.println(monster[i] + " has " + coins[i] + " gold coins.");
		}
		
		String[] abilities = new String[monster.length];
		
		abilities[0] = "bones";
		abilities[1] = "feathers";
		abilities[2] = "stream sniping";
		abilities[3] = "a sword";
		abilities[4] = "pumpkins";
		abilities[5] = "spit";
		abilities[6] = " Shurikens";
		
		System.out.println();
		//Prints out abilities
		for(int i = 0; i < monster.length; i++) {
			System.out.println(monster[i] + " Will attack with " + abilities[i]);
		}
		System.out.println();
		int[] hp = new int[monster.length];
		//assign random hp
		for(int i = 0; i < monster.length; i++) {
			hp[i] = (int)(Math.random() * 15 + 2);
		}
		System.out.println();
		//Prints out hp
		for(int i = 0; i < monster.length; i++) {
			System.out.println(monster[i] + " has " + hp[i] + " health points");
		}
		System.out.println("the " + monster[2] + " ate a teenager, how " +
		"many coins did it get? "); // Prompt to enter a number
		//taking in a number from user input
		coins[2] += input.nextInt(); // Adding coins to coins[2]
		input.nextLine();// get rid of extra enter character
		
		//taking in a string from user input
		System.out.println(monster[2] + " morphs onto what?: " ); // Prompt
		monster[2] = input.nextLine();
		
		System.out.println("the monster is a: " + monster[2]);
		
		
		//todo list
		int totalCoins = coins[monster.length -1];//accumulator
		int turns = 0;//track turns
		//fight while player hp > 0
		while(hp[hp.length-1] > 0) {
			int randomMonster = (int)(Math.random() * monster.length);//pick random monster
			if(randomMonster != monster.length-1) {
		    //decide hit or be hit
			int hitChance = (int)(Math.random() * 2);
			
			if(hitChance % 2 == 0) {// 
			  //subtract random hp if player is hit
			  int randomDmg = (int)(Math.random() * 2 + 1);//creating random number
			  hp[monster.length - 1] -= randomDmg; //subtracting hp
			  System.out.println(monster[randomMonster] + " hit you for "
			  		+ randomDmg + " hp! " + hp[monster.length-1]
			  	    + " HP Left ");
			}
			else {
				System.out.println("player hits with" + abilities[monster.length - 1]
					+ " " + monster[randomMonster] + " runs away. It left "
					+ coins[randomMonster] + " coins");
				
					
			//collect coins
				totalCoins += coins[randomMonster];
		    }
			//track numbers of turns
			turns++;
		  }//end if
			System.out.println();
		}//end while
		
		System.out.println("You run away with " + totalCoins + " coins "
			+ "and lasted " + turns + " Turns. ");
			
	}//end main
	
		

}
