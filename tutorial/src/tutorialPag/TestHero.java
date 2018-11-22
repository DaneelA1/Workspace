package tutorialPag;

public class TestHero {

	public static void main(String[] args) {
		
		Hero h1 = new Hero();
		Hero h2 = new Hero("Batman ", "Gadgets", 30, 120, 30);
		Hero h3 = new Hero("Flash ", "Speed ", 20, 150, 50);
		Hero h4 = new Hero("Marc ", "Baller", 16, 100, 1000);
		
		
		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
		System.out.println(h4.toString());
		System.out.println();
		
		Meteorite m = new Meteorite();
		
		m.mutate(h1);
		m.mutate(h2);
		m.mutate(h3);
		m.mutate(h4);
		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
		System.out.println(h4.toString());
		System.out.println();
		
		while(h1.getHealth() > 0) {
		h2.attack(h1);
		System.out.println("hero 1 health: " + h1.getHealth());
	  }//end while
		
	}

}
