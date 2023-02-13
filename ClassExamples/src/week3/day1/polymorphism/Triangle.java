package week3.day1.polymorphism;

public class Triangle extends Shape {

	private double base;
	private double height;
	
	
	public void setBase(double base){
		this.base = base;
	}

	public void setHeight(double height){
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return ((base * height)/2);
	}
	
	@Override
	public String toString() {
		return "The area of " + getShapeName() + " (base=" + base + ", height=" + height + ") is " + calculateArea();
	}

}
