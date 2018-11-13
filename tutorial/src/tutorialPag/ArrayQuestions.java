package tutorialPag;

public class ArrayQuestions {

	public static void main(String[] args) {
		double sgt[] = new double[50]; //  creates double called sgt that has 800 elements
        for (int i = 0; i<sgt.length; i++) { // for loop that cycles through all the elements
		        sgt[i] = i*i; // Stores the square root of the inde
        }
        
     
        System.out.println(sgt.length);
	}

}
