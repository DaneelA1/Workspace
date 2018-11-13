package tutorialPag;
import java.util.Random;
public class ArrayPractice1 {

	public static void main(String[] args) {
		String[] nameArray = {"christian","Tyrone","uniqua","scott","nya","mr.truong"};
		int[] gradesArray = new int[nameArray.length];
		int avg = 0;
		
		for(int i = 0; i < nameArray.length; i++) { //Print arrays
			System.out.println("Name: " + nameArray[i] + " Grade: " + gradesArray[i]);
		}
		Random r = new Random();//Creates random object
		
		for(int i = 0; i < gradesArray.length; i++) { // Print grades entry
			gradesArray[i] = r.nextInt(101);
		}
		for(int i = 0; i < nameArray.length; i++) { // Print Arrays
			System.out.println("Name: " + nameArray[i] + " Grade: " + gradesArray[i]);
		}
		gradesArray[5] = 85; // Update index 5
		System.out.println();
		for(int i = 0; i < nameArray.length; i++) { //Print arrays 
			System.out.println("Name: " + nameArray[i] + " Grade: " + gradesArray[i]);
		}
		for(int i = 0; i < nameArray.length; i++) { //avg
			avg += gradesArray[i]; // summing the grades
//				System.out.println(avg);
			
		}
		avg = avg/gradesArray.length; // dividing by total number of grades
		System.out.println("class average: " + avg); //Print the avg
	}

}
