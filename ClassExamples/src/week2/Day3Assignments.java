package week2;

public class Day3Assignments {

	// Question1
	/*
	 * Write a program that uses nested for loops to print a multiplication table.
	 * 12 x 12
	 */
	public void multiTable() {
		for(int i = 1; i <= 12; i++) {
			for(int j = 1; j <= 12; j++) {
				System.out.print(" " + j*i + " ");
			}
			System.out.println("");
		}
	}

	// Question2
	/*
	 * Write a program that prompts the user to enter two positive integers, and
	 * find their greatest common divisor (GCD). Examples: Enter 2 and 4. The gcd is
	 * 2. Enter 16 and 24. The gcd is 8. How do you find the gcd? Name the two input
	 * integers n1 and n2. You know number 1 is a common divisor, but it may not be
	 * the gcd. Check whether k (for k = 2, 3, 4, and so on) is a common divisor for
	 * n1 and n2, until k is greater than n1 or n2.
	 */
	public void grtComDenom(int num1, int num2) {
		int gcd = 0;
		int endNum = num1 > num2 ? num1 : num2;
		int i = 1;
		while(i <= endNum) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
			i++;
		}
		System.out.printf("The greatest common denominator between %d and %d is %d", num1, num2, gcd);
	}
	

	// Question3
	/*
	 * Suppose the tuition for a university is $10,000 for the current year and
	 * increases by 7 percent every year. In how many years will the tuition be
	 * doubled? $20,000?
	 */
	public void findDouble() {
		int tuition = 10000;
		int yrCount = 1;
		for(int currentT=tuition; currentT < (tuition * 2); currentT *= 1.07) {
			System.out.println("year: " + yrCount + " current tuition: " + currentT);
			yrCount++;
		}
		System.out.println("Tuition doubles in " + yrCount + " years.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day3Assignments go = new Day3Assignments();
		go.multiTable();
//		go.findDouble();
//		go.grtComDenom(35, 77);
	}

}
