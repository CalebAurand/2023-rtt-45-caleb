package week2;

public class PracticeAssignmentsDay1 {
	/*
	 * Practice Assignment Operators and Numbers --->>> Non Bitwise Practice
	 * 
	 * >>>>>Write a program that declares an integer variable, assigns a number, and
	 * uses a postfix increment operator to increase the value. Print the value
	 * before and after the increment operator.
	 * 
	 * >>>>>Write a program that demonstrates at least 3 ways to increment a
	 * variable by 1 and does this multiple times. Assign a value to an integer
	 * variable, print it, increment by 1, print it again, increment by 1, and then
	 * print it again.
	 * 
	 * >>>>>Write a program that declares 2 integer variables, x, and y, and then
	 * assigns 5 to x and 8 to y. Create another variable sum and assign the value
	 * of ++x added to y, and print the result. Notice the value of the sum (should
	 * be 14). Now change the increment operator to postfix (x++) and re-run the
	 * program. Notice what the value of the sum is. The first configuration
	 * incremented x and then calculated the sum, while the second configuration
	 * calculated the sum and then incremented x.
	 * 
	 */
	public static void main(String[] args) {
		int b = 5;
		System.out.println("b before increment = " + b);
		b++;
		System.out.println("b after increment = " + b);

		// incrementing a by 1 multiple times
		int a = 1;
		System.out.println("a is value: " + a);
		a++;
		System.out.println("a is value: " + a);
		a += 1;
		System.out.println("a is value: " + a);
		a = a + 1;
		System.out.println("a is value: " + a);

		int x = 5;
		int y = 8;
		int sum = ++x + y;
		System.out.println("sum is value: " + sum);

		// resetting value of x to 5 for comparison equation.
		x = 5;
		sum = x++ + y;
		System.out.println("sum is value: " + sum);

		/**
		 * Write a program that declares 2 integer variables, assigns an integer to
		 * each, and adds them together. Assign the sum to a variable. Print out the
		 * result.
		 */
		int c = 2;
		int d = 7;
		int result = c + d;
		System.out.println("result is " +result);
		
		/* Write a program that declares 2 double variables, assigns a number to each,
		 * and adds them together. Assign the sum to a variable. Print out the result.
		 */
		double firstDouble = 2.0;
		double secondDouble = 3.0;
		double doubleResult = firstDouble + secondDouble;
		System.out.println("double result " + doubleResult);
		
		/* Write a program that declares an integer variable and a double variable,
		 * assigns numbers to each, and adds them together. Assign the sum to a
		 * variable. Print out the result. What variable type must the sum be?
		 */
		int newInt = 7;
		double newDouble = 9.0;
		double doubleSum = newInt + newDouble;
		System.out.println("doubleSum = " + doubleSum);
		
		/* Write a program that declares 2 integer variables, assigns an integer to
		 * each, and divides the larger number by the smaller number. Assign the result
		 * to a variable. Print out the result. Now change the larger number to a
		 * decimal. What happens? What corrections are needed?
		 */
		double firstInt = 3.0;
		int secondInt = 2;
		double divideResult = firstInt / secondInt;
		System.out.println("divide result " + divideResult);
		
		
		/* Write a program that declares 2 double variables, assigns a number to each,
		 * and divides the larger by the smaller. Assign the result to a variable. Print
		 * out the result. Now, cast the result to an integer. Print out the result
		 * again.
		 */
		double thirdDouble = 5.7;
		double fourthDouble = 11.1;
		double secondDivResult = fourthDouble / thirdDouble;
		System.out.println("second double division " + secondDivResult);
		System.out.println("casting double division to int " + (int)secondDivResult);

		
		/* Write a program that declares two integer variables, x, and y, and assigns 5
		 * to x and 6 to y. Declare a variable q and assign y/x to it and print q. Now,
		 * cast y to a double and assign it to q. Print q again.
		 */
		//x and y instantiated earlier in the file
		x = 5;
		y = 6;
		double q = y/x;
		System.out.println("first print of q " + (int)q);
		q = (double)y / x;
		System.out.println("second print of q " + q);
		
		
		/*
		 * Write a program that declares a named constant and uses it in a calculation.
		 * Print the result.
		 */
		final double PI = 3.1415927;
		int radius = 7;
		double areaOfCircle = radius*radius * PI;
		System.out.printf("the area of a circle with radius %d is %f\n", radius, areaOfCircle);
		
		
		/*
		 * Write a program where you create 3 variables that represent products at a
		 * cafe. The products could be beverages like coffee, cappuccino, espresso,
		 * green tea, etc. Assign prices to each product. Create 2 more variables called
		 * subtotal and totalSale and complete an “order” for 3 items of the first
		 * product, 4 items of the second product, and 2 items of the third product. Add
		 * them all together to calculate the subtotal. Create a constant called SALES_TAX 
		 * and add sales tax to the subtotal to obtain the totalSale amount. 
		 * Be sure to format the results to 2 decimal places.
		 */
		double coffeePrice = 1.20;
		double espressoPrice = 2.45;
		double teaPrice = 1.10;
		double subTotal = 0;
		double totalSale = 0;
		final double SALES_TAX = 0.08;
		
		subTotal = (3 * coffeePrice) + (4 * espressoPrice) + (2 * teaPrice);
		totalSale = (SALES_TAX * subTotal) + subTotal;
		totalSale *= 100;
		totalSale = Math.round(totalSale);
		totalSale /=100;
		System.out.println("The total is " + totalSale);
		
	}
}
