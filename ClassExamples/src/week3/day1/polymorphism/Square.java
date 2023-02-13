package week3.day1.polymorphism;

public class Square extends Shape{

	private double length;
	private double height;
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	//this is the implementation of the AreaCalculation interface
	@Override
	public double calculateArea() {
		double area = length * height;
		return area;
	}
	
	//this method overrides the toString function of Object which is the 
	//parent of all objects in Java. Its there automatically and you don't need
	//anything to use it
	@Override
	public String toString() {
		return "The area of " + getShapeName() + " (length=" + length + ", height=" + height + ") is " + calculateArea();
	}
	
}
