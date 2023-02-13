package week3.day1.polymorphism;

public class AnimalMain {

	public static void main(String[] args) {

		Animal newAnimal = new Animal();
		newAnimal.animalSound();

		Animal dog = new Dog(); // this is an example of upcasting (compiler does automaticallY)
		// upcasting does not need any additional syntax to do it
		dog.animalSound();
		dog.animalEats();

		Animal fish = new Fish();
		fish.animalSound();
		fish.animalEats();

		Dog d2 = (Dog) dog; // this is an example of downcasting
		d2.favAction(); // by down casting we gain access to the methods implemented in dog object

		System.out.println("newAnimal an instanceOf Animal? : " + (newAnimal instanceof Animal));
		System.out.println("Dog an instanceOf Animal? : " + (dog instanceof Animal));
		System.out.println("Animal an instanceOf Dog? : " + (newAnimal instanceof Dog));
		System.out.println("fish an instanceOf Animal? : " + (fish instanceof Animal));
		System.out.println("newAnimal an instanceOf fish? : " + (newAnimal instanceof Fish));
		System.out.println("d2 an instanceOf Dog? : " + (d2 instanceof Dog));
		System.out.println("d2 an instanceOf Animal? : " + (d2 instanceof Animal));
	}

}
