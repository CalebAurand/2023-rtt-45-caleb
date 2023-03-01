package com.tek.sba;

import java.util.Arrays;

//need to implement an interface
public class Question2 {

	// for this question, you need to accept all input with assumption that
	// the input is asking for things from a 1 index based array

	// they are going to give you the size
	private static final int ARRAY_SIZE = 5;
	private int[] arr;

	Question2() {
		// we need to make a 1 based data structure for an array of size 5
		// an array is zero based, so when we need 5 elements, they go from 0 to 4
		// however since our array is 1 based .. how many elements do we need

		// the key to victory in this question is to ignore the 0th element of the array
		//******************* This is important to add 1 to what ever they give you or it will array index out of bounds exception****************
		// initialize this entire array to a value ... -1
		arr = new int[ARRAY_SIZE + 1];

		for (int i = 1; i < arr.length; i++) {
			arr[i] = -1;
		}
	}

	public static void main(String[] args) {
		Question2 q2 = new Question2();

		int[] avg = { 1, 2, 3, 4, 5, 6, 7 };
		q2.calculateAverage(avg);

		q2.setValue(4);
		//print first message value was set to 1
		q2.setValue(5);
		//print first message setting value to 1
		q2.setValue(4);
		//print second message that value was already set

		
		q2.move(50, 3);
		//print 1st message
		
		q2.move(30, 3);
		//print 2nd message
		
		q2.move(30,  4);
		//print 2nd message
	}

	//this will be in an interface
	// and will be the exact same implementation in both classes
	public void calculateAverage(int[] arr) {
		// calculate the average
		// print out a message using system.out.format of the average with
		// decimal format this using %.2f
		// to show 2 decimal places (can use printf)
		// include new line character at the end of the message
		double average = 0;
		for(int el : arr) {
			average += el;
		}
		average = average / arr.length; //<< Will probably have to adjust this to the ARRAY_SIZE final variable
		System.out.printf("average is %.2f\n", average);
	}

	//this will be in an interface
	public void setValue(int value) {// this is index, but they will call it value
		// this will be using the class level variable (class member)
		// if the value at array[index] == -1 then set the value to 1 and print a message of the
		// value you set
		// otherwise print a message that it was already changed
		if(arr[value] == -1) {
			arr[value] = 1;
			System.out.println("Position arr[" + value + "] was changed to 1");
		}else {
			System.out.println("Value at arr[" + value+ "] was already changed");
		}
		
		//printing array for debugging
		System.out.println(Arrays.toString(arr));
	}
	
	//this will be an extra function in one of the 2 classes
	public void move(int value, int id) {
		// if the value at array[id] == -1 then print a message saying "Value with id: {id} is moved to {value}" and set the value to 1
		// otherwise print a message saying "Value is already -1"
		if(arr[id] == -1){
			System.out.println("Value with id: "+ id + " is moved to " + value);
			arr[id] = 1;
		}else {
			System.out.println("Value is already 1");
		}
	}
}
