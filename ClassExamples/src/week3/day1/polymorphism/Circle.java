package week3.day1.polymorphism;

public class Circle extends Shape{
	private static final double PI = 3.14159;
	private double radius;
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	@Override
	public double calculateArea() {
		return PI * (radius * radius);
	}
}
