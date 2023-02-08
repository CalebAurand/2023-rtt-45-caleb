package week2;

import java.util.Scanner;

public class Day2Part2 {

	public static void main(String[] args) {
		Day2Part2 d2 = new Day2Part2();		
		
		boolean userInput;
		d2.ifStatement();
		d2.grade();
//		d2.bmi();
		d2.caseStatement();
	}

	public void ifStatement() {
		int a = 1;
		int b = 2;
		
		if ( a < b ) {
			System.out.println("This evaluated to true");
		}else {
			System.out.println("This evaluated to false");
		}
		
		System.out.println("This is executed after the if statement no matter what");
	}
	
	public void grade() {
		int grade = 150;
		
		if(grade > 100 || grade < 0) {
			System.out.println("Grade " + grade + " is invalid.");
			if(grade > 100) {
				System.out.println("The grade " + grade + " is positive");
			}else {
				System.out.println("The grade " + grade + " is negative");
			}
		}else if (grade >= 90) {
			System.out.println("Grade for the course is an A");
		}else if(grade >= 80) {
			System.out.println("Grade for the course is an B");
		}else if (grade >= 70) {
			System.out.println("Grade for the course is an C");
		}else if (grade >= 60) {
			System.out.println("Grade for the course is an D");
		}else {
			System.out.println("Grade for the course is an F");
		}
		
		System.out.println("This is executed after the if statement no matter what");
	}
	
	public void bmi() {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Input weight in kilogram: ");
	    double weight = sc.nextDouble();
	    System.out.print("\nInput height in meters: ");
	    double height = sc.nextDouble();
	    // calculate bmi
	    double BMI = weight / (height * height);
	    // check range
	    if(BMI < 18.5)
	        System.out.println("Under weight");
	    else if(BMI >= 18.5 && BMI < 25)
	        System.out.println("Normal");
	    else if(BMI >=  25 && BMI < 30)
	        System.out.println("Overweight");
	    else
	        System.out.println("Obese");
	    System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2\n");
	}
	
	public void caseStatement() {
		int menuSelection = 3;
		
		switch(menuSelection) {
		case 1: System.out.println("Selection is #1");
		break;
		case 2: System.out.println("Selection is #2");
		break;
		default: System.out.println("default case");
		}
	}
}
