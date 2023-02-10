package week2;

public class Person {

	String name;
	private int age = 0;
	private double income = 1.00;

	//initial constructor for just person with a name
	public Person (String fullName){
		name = fullName;
	}

	//constructor with a person with name and age
	public Person (String fullName, int yearsOld){
		name = fullName;
		age = yearsOld;
	}

	//constructor for person with name, age, and income
	public Person (String fullName, int yearsOld, double moneyIncome){
		this.name = fullName;
		this.age = yearsOld;
		this.income = moneyIncome;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person("Bob");
		System.out.println("Hi my name is " + person1.name);
	}

}
