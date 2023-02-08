package week2;

import java.util.Scanner;

public class Day2PracticeAssignments {

	/*
	 * 1.Write a program that declares 1 integer variable x, and then assigns 7 to
	 * it. Write an if statement to print out “Less than 10” if x is less than 10.
	 * Change x to equal 15, and notice the result (console should not display
	 * anything).
	 */
	public void lessThan10() {
		int x = 15;
		
		if(x < 10) {
			System.out.println("Less than 10");
		}
	}

	/*
	 * 2. Write a program that declares 1 integer variable x, and then assigns 7 to
	 * it. Write an if-else statement that prints out “Less than 10” if x is less
	 * than 10, and “Greater than 10” if x is greater than 10. Change x to 15 and
	 * notice the result.
	 */
	public void greaterThan() {
		int x = 17;
		if(x < 10) {
			System.out.println("Less than 10");
		}else {
			System.out.println("Greater than 10");
		}
	}

	/*
	 * 3. Write a program that declares 1 integer variable x, and then assigns 15 to
	 * it. Write an if-else-if statement that prints out “Less than 10” if x is less
	 * than 10; “Between 10 and 20” if x is greater than 10 but less than 20, and
	 * “Greater than or equal to 20” if x is greater than or equal to 20. Change x
	 * to 50 and notice the result.
	 */
	public void between() {
		int x = 50;
		if(x < 10) {
			System.out.println("Less than 10");
		}else if(x < 20) {
			System.out.println("Between 10 and 20");
		}else {
			System.out.println("Greater than or equal to 20");
		}
	}

	/*
	 * 4. Write a program that declares 1 integer variable x, and then assigns 15 to
	 * it. Write an if-else statement that prints “Out of range” if the number is
	 * less than 10 or greater than 20 and prints “In range” if the number is
	 * between 10 and 20 (including equal to 10 or 20). Change x to 5 and notice the
	 * result.
	 */
	public void ifX() {
		int x = 15;
		if (x < 10 || x > 20) {
			System.out.println("Out of range");
		} else {
			System.out.println("In range");
		}
	}
	
	/*
	 * 5. Write a program that uses if-else-if statements to print out grades A, B,
	 * C, D, F according to the following criteria: A: 90-100 B: 80-89 C: 70-79 D:
	 * 60-69 F: <60 Use the Scanner class to accept a number score from the user to
	 * determine the letter grade. Print out “Score out of range” if the score is
	 * less than 0 or greater than 100.
	 */
	public void grades() {
		Scanner gradeScan = new Scanner(System.in);
		float grade = 0.00F;
		
		System.out.println("please enter the grade here >>");
		grade = gradeScan.nextFloat();
		
		if (grade > 100 || grade < 0) {
			System.out.println("Grade is invalid");
		} else if (grade > 89) {
			System.out.println("A");
		} else if (grade > 79) {
			System.out.println("B");
		} else if (grade > 69) {
			System.out.println("C");
		} else if (grade > 59) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		// close the scanner
		gradeScan.close();
		
	}

	/*
	 * 6. Write a program that accepts an integer between 1 and 7 from the user. Use
	 * a switch statement to print out the corresponding weekday. Print “Out of
	 * range” if the number is less than 1 or greater than 7. Do not forget to
	 * include “break” statements in each of your cases.
	 */
	public void userNum() {
		
		Scanner scanNum = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 7: ");
		int num = scanNum.nextInt();
		switch(num) {
		case 1: System.out.println("Sunday");
		break;
		case 2: System.out.println("Monday");
		break;
		case 3: System.out.println("Tuesday");
		break;
		case 4: System.out.println("Wednesday");
		break;
		case 5: System.out.println("Thursday");
		break;
		case 6: System.out.println("Friday");
		break;
		case 7: System.out.println("Saturday");
		break;
		default: System.out.println("Out of range");
		}
		scanNum.close();
	}

	/*
	 * 7. Create a program that lets the users input their filing status and income.
	 * Display how much tax the user would have to pay according to status and
	 * income.
	 */

	public void fileStatus() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Are you filing:\n a)Single\n b)Married Filing Joint\n c)Married Filing Separate\n d)Head of Household");
		System.out.println(">> ");
		
		//scan for filing status
		String filingStatus = scan.nextLine();
		String filingTitle = "";
		
		//scan for income
		System.out.println("What is your income?");
		System.out.println(">> ");
		int income = scan.nextInt();
		
		//variable for tax bracket
		int taxBracket = 0;
		//conditional based on filingStatus and income
		if(filingStatus.equals("a") || filingStatus.equals("b") || filingStatus.equals("c") || filingStatus.equals("d")) {
			if(filingStatus.equals("a")) {
				//income test cases single
				filingTitle = "Single";
				if(income >= 372951) {
					taxBracket = 35;
				}else if(income >= 171551) {
					taxBracket = 33;
				}else if(income >= 82251) {
					taxBracket = 28;
				}else if(income >= 33951) {
					taxBracket = 25;
				}else if(income >= 8351) {
					taxBracket = 15;
				}else{
					taxBracket = 10;
				}
			}else if(filingStatus.equals("b")) {
				//income test cases married joint
				filingTitle = "Married Filing Jointly";
				if(income >= 372951) {
					taxBracket = 35;
				}else if(income >= 208851) {
					taxBracket = 33;
				}else if(income >= 137051) {
					taxBracket = 28;
				}else if(income >= 67901) {
					taxBracket = 25;
				}else if(income >= 16701) {
					taxBracket = 15;
				}else{
					taxBracket = 10;
				}
			}else if(filingStatus.equals("c")) {
				//income test cases married filing separate
				filingTitle = "Married Filing Separately";
				if(income >= 186476) {
					taxBracket = 35;
				}else if(income >= 104426) {
					taxBracket = 33;
				}else if(income >= 68526) {
					taxBracket = 28;
				}else if(income >= 33951) {
					taxBracket = 25;
				}else if(income >= 8351) {
					taxBracket = 15;
				}else{
					taxBracket = 10;
				}
			}else {
				//income test cases head of household
				filingTitle = "Head of Household";
				if(income >= 372951) {
					taxBracket = 35;
				}else if(income >= 190201) {
					taxBracket = 33;
				}else if(income >= 117451) {
					taxBracket = 28;
				}else if(income >= 45501) {
					taxBracket = 25;
				}else if(income >= 11951) {
					taxBracket = 15;
				}else{
					taxBracket = 10;
				}
			}
			System.out.println("You are filing as: " + filingTitle);
			System.out.println("Your tax bracket is: " + taxBracket +"%");
		}else {
			System.out.println("Your input is invalid.");
		}
		scan.close();
	}

	public static void main(String[] args) {
		Day2PracticeAssignments d2Obj = new Day2PracticeAssignments();
//		d2Obj.lessThan10();
//		d2Obj.greaterThan();
//		d2Obj.between();
//		d2Obj.userNum();
		d2Obj.fileStatus();
		
//		d2Obj.grades();
//		d2Obj.ifX();
	}
}
