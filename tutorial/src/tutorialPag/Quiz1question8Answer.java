package tutorialPag;

public class Quiz1question8Answer {
	public static int smallest(int x,int y, int z) // A public static int smallest which has variables int x,int y, int z
	{
		int smallernum = java.lang.Math.min(x,y); // It will get the smallest of x and y and will store it
				
		int smallestnum = java.lang.Math.min(z, smallernum); // It will get the smallest of z and the result of x and y 
		
		return smallestnum; // It will return the result
		
	}

	public static void main(String[] args) { // Runs everything in the code
		System.out.println(smallest(2,4,6)); // It will check the smallest number which is 2
		System.out.println(smallest(220,10,35)); // It will check the smallest number which is 10
		System.out.println(smallest(115,425,100)); // It will check the smallest number which is 100
		

	}

}
