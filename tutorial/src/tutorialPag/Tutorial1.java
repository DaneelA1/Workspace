package tutorialPag;

import java.util.Scanner;
import java.util.Random;
public class Tutorial1 {

	public static void printName() {
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Hi Daneel");
		}	
	}
	
	public static void main(String[] args) {
		int varNum1;
		varNum1 = 10;
		
		int varNum2 = 25;
		
		int varNum3;
		
		varNum3 = varNum1 + varNum2;
		
		System.out.print(varNum3);
		System.out.println(varNum2);
		System.out.println(varNum1);
		
		printName();
		
if(varNum3 > 5) {
	System.out.println("greater");
}

else 
	System.out.println("less");

		String inData;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the data :");
		inData = scan.nextLine();

		System.out.println("You entered:" + inData);
		
		int num;
		int square;
		System.out.println("Enter the interger;");
		num = scan.nextInt();
		square = num + num ; // compute the square
		
		System.out.println("The square of " + num + " is " + square);
		
		Random rand = new Random();
		
		int randomNum = rand.nextInt(11) + 5;
		
		System.out.println(randomNum);
		
		
		
	}//end main

}//end class
