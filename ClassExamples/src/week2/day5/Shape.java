package week2.day5;

public class Shape {

	public static String SHAPE_NAME = "Shape";
	
	//this does not include the static keyword;
	public String NOT_STATIC = "Not static";
	
	public void printShape() {
		System.out.println("I am a shape.");
		shapeSize();
	}
	
	private void shapeSize() {
		System.out.println("Size of the shape");
	}
}
