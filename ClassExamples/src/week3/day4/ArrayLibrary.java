package week3.day4;

import java.util.Arrays;

public class ArrayLibrary {
	
	public int[] insertElement (int[] arr, int position, int number) throws NegativePositionException, PositionTooLargeException, Exception{
		//first thing when you enter a function is to test your inputs
		if(position < 0) {
			throw new NegativePositionException("Position must be greater than 0");
		}
		
		if(position >= arr.length) {
			throw new PositionTooLargeException("Position must be less than arr.length");
		}
		
		
		
		// 1 create a new array that is 1 larger than the size of arr
		// 2 copy all elements from arr into the new copy
		// 3 move all elements in the array starting at position to the end 1 space to the right
		//	arr[i+1] = arr[i]
		// 4 set arr[position] = number
		
		int[] copy = append(arr, 0);
		printArray(copy, "copy initialized to");
		
		for(int i = position; i < arr.length; i++) {
			copy[i+1] = arr[i];
		}
		printArray(copy, "copy shifted right");
		
		copy[position] = number;
//		printArray(copy, "new array presented");
		return copy;
		
		// attempt at refactoring
//		int[] newArr = new int[arr.length + 1];
//		
//		for ( int i = 0; i<arr.length; i++) {
//			if(i > position) {
//				newArr[i+1] = arr[i];
//			}else if(i == position) {
//				newArr[i] = number;
//				newArr[i+1] = arr[i];
//			}else {
//				newArr[i] = arr[i];
//			}
//		}
//		return newArr;
	}
	
	public void printArray(int[] arr, String message) {
		System.out.println(message + "\t" + Arrays.toString(arr));
	}
	
	public int[] append(int[] arr, int value) {
		int[] copy = new int[arr.length + 1];
		for( int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		copy[copy.length - 1] = value;
		
		return copy;
	}

	//this method takes in an array of ints and an index position of the element to be deleted
	public int[] delete(int[] arr, int position) {
		int[] copy = new int[arr.length - 1];
		for( int i = 0; i < copy.length; i++) {
			if(i >= position) {
				copy[i] = arr[i+1];
			}else {				
				copy[i] = arr[i];
			}
		}
		
		return copy;
	}
	
	//findElement
	public int findPositionOfValue(int[] arr, int value) {
		//find the position of the incoming value
		//if the value is not found, return -1
		//return the first element found
		for( int el : arr) {
			if(el == value) {
				return el;
				
			}
		}
		return -1;
	}
	
	//bubbleSort
	public void bubbleSort() {
		int[] arr = {1, 9, 10, 6, 5};
		
		for(int outer=0; outer<arr.length; outer++) {
			boolean swapped = false;
			for(int inner=0; inner<arr.length-1; inner++) {
				if(arr[inner] > arr[inner+1]) {
					int temp = arr[inner+1];
					arr[inner +1] = arr[inner];
					arr[inner] = temp;
					swapped = true;
				}
			}
			System.out.println(Arrays.toString(arr));
			if(!swapped) {break;}
		}
		
	}
}
