package week2;

//for assignments submit the class file of java, that is on github
//to the assignment submission input "website url"
public class Day1 {
	// declare functions/methods outside here
	public static void main(String[] args) {
		// can declare variables here

		// how you use
//		 +  Addition 		v = a + b;
//		 - 	Subtraction 	v = a – b;
//		 *  Multiplication	v = a * b
//		 /  Division		v = a / b;
//		 % 	Modulus			v = b % a;

//		== 	(equal to)
//		!= 	(not equal to)
//		> 	(greater than)
//		<	(less than)
//		>=	(greater than or equal to)
//		<=	(less than or equal to)
//		instanceOf	Test whether the object is an instance of the ***doesn't get used very often
		// specified type (class or subclass or interface). Checks what kind of object the instance is

//		 &&    	Logical AND
//		 ||		Logical OR

//		 +=    	Addition Assignment
//		 -=    	Subtraction Assignment
//		 *=     Multiplication Assignment
//		 /=     Division Assignment
//		 %=     Remainder Assignment

//		 <<=    Left Shift Assignment
//		 >>=    Right Shift Assignment
//		 &=     Bitwise AND Assignment
//		 ^=     Bitwise XOR Assignment
//		 |=     Bitwise OR Assignment

//		 - Unary Minus
//		 + Unary Plus
//		 ++ Increment Operator
//			prefix-increment or post-fix increment
//		 -- Decrement Operator
//			prefix-decrement or post-fix decrement
//
//		 ! Logical Not Operator
		boolean condition = true;
		System.out.println("Value of !condition = " + !condition);

		// ternary operator
		int age = 18;
		String result = age < 100 ? "Less than 100" : "Greater than 100";
		System.out.println(result); // Less than 100

		/*
		 * Calculations involving floating-point numbers are approximated because these
		 * numbers cannot be stored with perfect precision. For example:
		 */
		System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
		// displays 0.5000000000000001, not 0.5
		System.out.println(1.0 - 0.9);
		// displays 0.09999999999999998, not 0.1
//Integers are stored exactly. Therefore, calculations with integers yield an exact integer result. 

		//******Division and Modulus*********
		
		//5/2 yields an integer
		System.out.println(5/2);
		//5.0/2 yields an floating-point 2.5
		System.out.println(5.0/2);
		// 5%2 yields 1(the remainder of the operation
		System.out.println("remainder " + 5%2);
		//floating-point modulus 2.6 % 0.55 yields 0.1
		System.out.println(3.6%0.55);
	
	}
}
