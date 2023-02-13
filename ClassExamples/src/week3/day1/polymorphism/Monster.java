package week3.day1.polymorphism;

public abstract class Monster {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void attack() {
		System.out.println("generic attack");
	}
}
