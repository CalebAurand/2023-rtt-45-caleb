package week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day3Assignments {

	// Question1
	/*
	 * Write a program that uses nested for loops to print a multiplication table.
	 * 12 x 12
	 */
	public void multiTable() {
		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <= 12; j++) {
				System.out.print(" " + j * i + " ");
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
		while (i <= endNum) {
			if (num1 % i == 0 && num2 % i == 0) {
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
		for (int currentT = tuition; currentT < (tuition * 2); currentT *= 1.07) {
			System.out.println("year: " + yrCount + " current tuition: " + currentT);
			yrCount++;
		}
		System.out.println("Tuition doubles in " + yrCount + " years.");
	}

	// Question4
	/**
	 * Write a program that creates an array of integers with a length of 3. Assign
	 * the values 1, 2, and 3 to the indexes. Print out each array element.
	 */
	public void crtArr() {
		int[] arr = {1, 2, 3};
		for(int e : arr) {
			System.out.println(e);
		}
	}
	
	/**Question5
	 * Write a program that returns the middle element in an array. Give the
	 * following values to the integer array: {13, 5, 7, 68, 2} and produce the
	 * following output: 7
	 */
	public int retMid() {
		int[] arr = {13, 5, 7, 69, 2};
		int result = 0;
		
		//get length of array
		int length = arr.length;
		//get middle index of array
		int middle = length/2;
		//set result equal to value at middle index
		result = arr[middle];
		//return result
		return result;
	}

	/**Question6
	 * Write a program that creates an array of String type and initializes it with
	 * the strings “red”, “green”, “blue” and “yellow”. Print out the array length.
	 * Make a copy using the clone( ) method. Use the Arrays.toString( ) method on
	 * the new array to verify that the original array was copied.
	 */
	public void copyArr() {
		String[] strArr = {"red", "green", "blue", "yellow"};
		System.out.println(strArr.length);
		String[] arrCopy = strArr.clone();
		System.out.println(Arrays.toString(arrCopy));
		for(String el : arrCopy) {
			System.out.println(el);
		}
	}

	/**Question7
	 * Write a program that creates an integer array with 5 elements (i.e.,
	 * numbers). The numbers can be any integers. Print out the value at the first
	 * index and the last index using length - 1 as the index. Now try printing the
	 * value at index = length ( e.g., myArray[myArray.length ] ). Notice the type
	 * of exception which is produced. Now try to assign a value to the array index
	 * 5. You should get the same type of exception.
	 */
	public void throwException() {
		int[] arr = {1, 2, 4, 5, 6};
		System.out.println(arr[0]);
		System.out.println(arr[arr.length - 1]);
		arr[5] = 7;
		System.out.println(arr[arr.length]); 
	}

	/**Question8
	 * Write a program where you create an integer array with a length of 5. Loop
	 * through the array and assign the value of the loop control variable (e.g., i)
	 * to the corresponding index in the array.
	 */
	public void loopArrar() {
		int[] arr = {1, 2, 3, 4, 5};
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
	}

	/**Question9
	 * Write a program where you create an array of 5 elements. Loop through the
	 * array and print the value of each element, except for the middle (index 2)
	 * element.
	 */
	public void loopArray2() {
		int[] arr = {1, 2, 3, 4, 5};
		for(int i = 0; i<arr.length; i++) {
			if(i == 2) {
				continue;
			}
			System.out.println(arr[i]);
		}
	}
	

	/**Question10
	 * Write a program that creates a String array of 5 elements and swaps the first
	 * element with the middle element without creating a new array.
	 */
	public void swapArr() {
		int[] arr = {1, 2, 3, 4, 5};
		int temp = arr[arr.length/2];
		arr[arr.length/2] = arr[0];
		arr[0] = temp;
		for(int el : arr) {
			System.out.println(el);
		}
	}

	/**Question11
	 * Write a program to sort the following int array in ascending order: {4, 2, 9,
	 * 13, 1, 0}. Print the array in ascending order, and print the smallest and the
	 * largest element of the array. The output will look like the following:
	 *
	 * Array in ascending order: 0, 1, 2, 4, 9, 13 The smallest number is 0 The
	 * biggest number is 13
	 */
	public void sortArray() {
		int[] arr = {4, 2, 9, 13, 1, 0};
		int smallest = arr[0];
		int largest = arr[0];
		for(int j = 1; j<=arr.length; j++) {
			for(int i = 0; i<arr.length-1; i++) {
				int temp = arr[0];
				if(arr[i+1] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				};
				if(smallest > arr[i+1]) {
					smallest = arr[i+1];
				};
				if(largest < arr[i+1]) {
					largest = arr[i+1];
				}
			}
		}
		for(int el : arr) {
			System.out.print(el + ", ");
		}
		System.out.println("\nlargest is " + largest + " smallest is " + smallest);
	}

	/**Question12
	 * Create an array that includes an integer, 3 strings, and 1 double. Print the
	 * array.
	 */
	public void listing() {
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("5.55");
		
		for(String el : list) {
			System.out.println(el);
		}
	}

	/** Question13
	 * Write some Java code that asks the user how many favorite things they have.
	 * Based on their answer, you should create a String array of the correct size.
	 * Then ask the user to enter the things and store them in the array you
	 * created. Finally, print out the contents of the array.
	 *
	 * Example
	 * 
	 * How many favorite things do you have? 7
	 * 
	 * Enter your thing: phone Enter your thing: tv Enter your thing: xbox Enter
	 * your thing: wine Enter your thing: beer Enter your thing: sofa Enter your
	 * thing: book Your favorite things are: phone tv xbox wine beer sofa book
	 */
	public void userArray() {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many favorite things do you have?");
		System.out.println(">>");
		int num = scan.nextInt();
		
		String[] list = new String[num];
		for(int i = 0; i < num; i++) {
			System.out.println("Enter your thing: ");
			System.out.print(">> : ");
			String input = scan.next();
			list[i] = input;
		}
		for(String el : list) {
			System.out.println(el);
		}
		scan.close();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day3Assignments go = new Day3Assignments();
//		go.multiTable();
//		go.findDouble();
//		go.grtComDenom(35, 77);
//		System.out.println(go.retMid());
//		go.copyArr();
//		go.throwException();
//		go.loopArrar();
//		go.loopArray2();
//		go.swapArr();
//		go.sortArray();
//		go.listing();
		go.userArray();
	}

}
