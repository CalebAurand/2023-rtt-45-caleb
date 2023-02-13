package week3.day1.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class ImplementsMain {
	public static void main(String[] args) {
		Square s = new Square();
		s.setShapeName("square");
		s.setHeight(10);
		s.setLength(5);
		
		Square s1 = new Square();
		s1.setShapeName("square2");

		s1.setHeight(7);
		s1.setLength(7);
		
		Triangle t = new Triangle();
		t.setShapeName("triangle");
		t.setBase(7);
		t.setHeight(4);
		
		Triangle t1 = new Triangle();
		t1.setShapeName("triangle2");
		t1.setBase(5);
		t1.setHeight(10);
		
		Circle c = new Circle();
		c.setShapeName("circle");
		c.setRadius(5);
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add(s);
		shapes.add(s1);
		shapes.add(t);
		shapes.add(t1);
		shapes.add(c);
		
		
		for(Shape shape : shapes) {
			System.out.println(shape);
			
			//because we have implemented the toString function we can remove these lines of code
//			String name = shape.getShapeName(); //this is inherited from the Shape object
			//this implementation is mandatory due to the AreaCalculation
			//this is now defined at the shape level vvv
			double area = shape.calculateArea();
//			System.out.println("The area of a " + name + " is " + area);
			
		}
	}
}
