package week3.day1.polymorphism;

public class TestMonster {
	   public static void main(String[] args) {
	      // Program at the "interface" defined in the superclass.
	      // Declare instances of the superclass, substituted by subclasses.
	      Monster m1 = new FireMonster();   // upcast
	      Monster m2 = new WaterMonster();  // upcast
	      Monster m3 = new StoneMonster();  // upcast

	      m1.setName("r2u2");
	      m2.setName("u2r2");
	      m3.setName("r2r2");

	      // Invoke the actual implementation
	      m1.attack();  // Run FireMonster's attack()
	      m2.attack();  // Run WaterMonster's attack()
	      m3.attack();  // Run StoneMonster's attack()


	      // m1 dies, generate a new instance and re-assign to m1.
	      m1 = new StoneMonster();
	      m1.setName("a2b2");// upcast
	      m1.attack();  // Run StoneMonster's attack()


	      // We have a problem here!!!
//	      Monster m4 = new Monster();
//	      m4.setName("2rbd2");
//	      m4.attack();  // garbage!!!
	   }
}