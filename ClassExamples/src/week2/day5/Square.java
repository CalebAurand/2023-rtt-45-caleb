package week2.day5;

public class Square extends Shape {
	//example of overriding the parent method printShape() to do what square wants to do
	@Override
	public void printShape() {
		//super means run it in the parent class
		//in this case we are getting all of the functionality in the parent
		//plus the additional functionality in the child Square{}
		super.printShape();
		System.out.println("This is a different implementation of print shape in the square");
		
		SHAPE_NAME = "Square";
	}
	
	public void printSquare(){
		System.out.println("I am a square and my parent SHAPE_NAME = " + SHAPE_NAME);
	}
}
