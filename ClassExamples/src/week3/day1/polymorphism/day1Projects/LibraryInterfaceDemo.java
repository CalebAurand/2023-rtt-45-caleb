package week3.day1.polymorphism.day1Projects;

public class LibraryInterfaceDemo {
	public static void main(String[] args) {
		KidUser k1 = new KidUser();
		k1.setAge(10);
		KidUser k2 = new KidUser();
		k2.setAge(18);
		
		k1.registerAccount();
		k2.registerAccount();
		
		k1.setBookType("Kids");
		k1.requestBook();
		k2.setBookType("Fiction");
		k2.requestBook();
		
		AdultUser a1 = new AdultUser();
		AdultUser a2 = new AdultUser();
		
		a1.setAge(5);
		a2.setAge(23);
		
		a1.registerAccount();
		a2.registerAccount();
		a1.setBookType("Kids");
		a2.setBookType("Fiction");
		
		a1.requestBook();
		a2.requestBook();
	}
}
