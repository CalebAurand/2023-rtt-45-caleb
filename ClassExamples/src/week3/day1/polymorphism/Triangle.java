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
		StringBuffer response = new StringBuffer();
		response.append("The area of ");
		response.append(getShapeName());
		response.append(" (base=");
		//... the rest of the string
		
		//this calls the toString method ot convert the StringBufer to an immutable String
		response.toString();
		
		return "The area of " + getShapeName() + " (base=" + base + ", height=" + height + ") is " + calculateArea();
	}

}
