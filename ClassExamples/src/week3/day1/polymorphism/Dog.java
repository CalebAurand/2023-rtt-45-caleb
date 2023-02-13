package week3.day1.polymorphism;

public class Dog extends Animal{
	@Override
	public void animalSound() {
		System.out.println("The dog says: ruff ruff");
	}
	
	
	public void favAction() {
		System.out.println("Play fetch");
		
	}
}
