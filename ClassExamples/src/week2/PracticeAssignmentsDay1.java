package week2;

public class PracticeAssignmentsDay1 {
	/*
	 * Practice Assignment Operators and Numbers --->>>
	 * Non Bitwise Practice 
	 * 
	 * >>>>>Write a program that declares an integer variable, assigns a number, and uses a
	 * 	postfix increment operator to increase the value. Print the value before and
	 * 	after the increment operator. 
	 * 
	 * >>>>>Write a program that demonstrates at least 3
	 * 	ways to increment a variable by 1 and does this multiple times. Assign a
	 * 	value to an integer variable, print it, increment by 1, print it again,
	 * 	increment by 1, and then print it again. 
	 * 
	 * >>>>>Write a program that declares 2 integer variables, x, and y, 
	 * 	and then assigns 5 to x and 8 to y. Create
	 * 	another variable sum and assign the value of ++x added to y, and print the
	 * 	result. Notice the value of the sum (should be 14). Now change the increment
	 * 	operator to postfix (x++) and re-run the program. Notice what the value of
	 * 	the sum is. The first configuration incremented x and then calculated the
	 * 	sum, while the second configuration calculated the sum and then incremented
	 * 	x.
	 * 
	 */
	public static void main(String[] args) {
		int b = 5;
		System.out.println("b before increment = " + b);
		b++;
		System.out.println("b after increment = " + b);
		
		//incrementing a by 1 multiple times
		int a = 1;
		System.out.println("a is value: " + a);
		a++;
		System.out.println("a is value: " + a);
		a +=1;
		System.out.println("a is value: " + a);
		a = a+1;
		System.out.println("a is value: " + a);
		
		int x = 5; 
		int y = 8;
		int sum = ++x + y;
		System.out.println("sum is value: " + sum);
		System.out.println("x is value: " + x++);
		sum = x++ + y;
		System.out.println("sum is value: " + sum);
	}
}
