package tutorialPag;

import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {
		ArrayList <Integer> listOfInts = new ArrayList<>();
		//useful methods of ArrayList
		
		listOfInts.add(98); // Adding to ArrayList
		listOfInts.add(55);
		listOfInts.add(1,80); // Inserts to index 1 in this case
		listOfInts.remove(0); // Removes item at first index
		listOfInts.get(0); // This returns item at index 0
		listOfInts.size(); // Returns size of ArrayList
		
		//print arraylist
		listOfInts.add(98);
		listOfInts.add(24);
		
		for(int i = 0; i < listOfInts.size(); i++) {
			System.out.println(listOfInts.get(i));
		}
		
		listOfInts.remove(listOfInts.size()-1); // Remove last element
		// Print new ArrayList
		for(int i = 0; i < listOfInts.size(); i++) {
			System.out.println(listOfInts.get(i));
		}
		
	}

}
