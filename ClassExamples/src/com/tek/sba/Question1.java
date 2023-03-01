package com.tek.sba;

import java.util.ArrayList;
import java.util.List;

//**************** when  making a new class in hackerrank do not use any access modifer**********
// make sure your output is exact .. really exactly like the requirements
public class Question1 {
	// String x = null; //this means that no string object has been created and there is no memory allocated
	// String y = ""; //this is an empty string that has been allocated to memory

	// ( x == null ) is true, but not what we need to check for in this question
	// ( x.equals("") ) will throw a NullPointerException
	// ( y.equals("") ) is true <<This is what we need to check for in the question
	// ( y == null ) is false
	public static void main(String[] args) {
		// how to transfer an array into an arraylist
		String[] arr = {"zero", "one", "two", "three", "four", "five"};
		
		Question1 q1 = new Question1();
		q1.convert(arr);
		
		q1.replace(2);
		// i have replaced two with the empty string
		
		q1.replace(4);
		//i have replaced four with an empty string
		
		List<String> compacted = q1.compact();
		//print compacted should produce
		// zero, one, three, five
	}
	
	private ArrayList<String> varList;
	
	//constructor
	public Question1() {
		//in the constructor create a new array list
		varList = new ArrayList<>();
		System.out.println("Constructing ArrayList \"varList\"");
	}
	
	// Know how to convert an array of strings to a list of strings
	public void convert( String[] arr) {		
		for ( String str : arr ) {
			varList.add(str);
		}
		
		//add the elements in the string array to the Arraylist of strings
	}
	
	//add a string in the array a
	public void replace( int idx ) {
		// in an arraylist, write the value at idx to be an empty string
		//print a message saying what the value of the position in the list is
		// and the value you are over writing it with
		System.out.println("The value at position: " + idx + " is: " + varList.get(idx));
		varList.set(idx, "");
		System.out.println("It has been overwritten with \"\"");
		System.out.println("==>"+varList.get(idx)+"<==");
	}
	
	public ArrayList<String> compact(){
		// remove all values in the array list that are empty strings
		for(int i=0; i<varList.size(); i++) {
			if(varList.get(i).equals("")) {
				varList.remove(i);
			}
		}
		System.out.println(varList);
		return varList;
	}

}
