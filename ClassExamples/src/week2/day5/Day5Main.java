package week2.day5;

public class Day5Main {
	
	//static means there is only one of these in the JVM
	//this means that only one variable x is created in memory for the entire virtual machine
	//this mostly gets used when you are creating a constant
	public static double PI = 3.1415927;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s = new Shape();
		s.printShape();
		System.out.println("Accessing shape name staticly from shape class " + Shape.SHAPE_NAME);
		
		//HOWEVER because our NOT_STATIC member variable is not static we must use an instance of the class
		//Shape.NOT_STATIC; // this can't be done
		System.out.println(s.NOT_STATIC);
		
		//this is calling the static method on the Shape object;
		//not that we do not need to use an instance.. this is similar to the Arrays class
//		Shape.createShape();S
		Shape.SHAPE_NAME = "XXXXXXXXXX";
		
		System.out.println("====================");
		
		Square sq = new Square();
		sq.printShape();
		sq.printSquare();
		
		System.out.println("====================");
		
		Circle c = new Circle();
		c.printShape();
		c.printCircle();
	}

}
