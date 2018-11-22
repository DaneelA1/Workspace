package tutorialPag;

public class TestRect {

	public static void main(String[] args) {
	
	  Rect r1 = new Rect();
	  Rect r2 = new Rect(5,15,200,100);
	  
	  
	  r2.translate(5,20);
	  System.out.println(r1.toString());
	  System.out.println(r2.toString());
	}

}
