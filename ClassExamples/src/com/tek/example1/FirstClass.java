package com.tek.example1;

import java.util.Scanner;

//classnames are camel case with first letter uppercase
//interfaces follow the same naming convetion as a class name

public class FirstClass {
	/*
	 * This can be used for a much longer comment that spans multiple lines in the
	 * file.
	 * 
	 * Eclipse has a built in formatting tool. All members of the team must have the
	 * tool configured in the same way, otherwise you have a high propability of
	 * merge conflicts, not because the code has changed but because the formatting
	 * has changed
	 * 
	 * To use the built in formatting 1) Ctrl - a to select the entire file 2) Ctrl
	 * shift f - to format the file
	 * 
	 * this tool will also convert spaces to tab within code indentation
	 */
	public static void main(String[] args) {
		System.out.println("My first java TEK program.");

		for (int i = 1; i < 5; i++) {
			System.out.println("looping " + i);
		}

		// this is a single line comment, for a string
		String s = "some text \n on a new line \n with a \" and a \\ ";
		System.out.println(s);

		int i = 5 + 5;
		System.out.println("i is " + i);

		System.out.printf("bob's name is %s\n", "bob");
		System.out.printf("I would like to introduce you to \n \t >>%s\n", "Fred");
		System.out.printf("He is %d years old and a %s.", 30, "distance runner");

		String personName = getName();
		System.out.println(personName);

		// Notes section 2/6/2023***********************

		// constant is all letters uppercase with underscore separating words.
		final String CONSTANT_VARIABLE_NAME = "Some string constant";

		// all variables are camel case with first letter lowercase
		final String someVariableName;

		// never use _ (underscore) in a variable name
		final String this_is_not_okayString;

		// variable names can never start with a number
		// public String 1string;
		final String oneString;

		// variables can have a number in it .. they just can't start with a number
		final String oneString23;

		// the difference between a tab and a space is a tab is equal to 4 space
		// characters in eclipse
		// however the tab and space characters are 2 different characters
		final String spaces = "       ";
		final String tab = "\t";

		System.out.println("my utf8char " + myUtf8Char);
	}

	// function names are same as variable names lowercase to start the name
	// with camel case for words
	// the curly braces up or down is also determined by the team
	public void functionName() {
		System.out.println("blarg");
	}

	// this is "wrong" unless the team agrees to do it this way
	// curly braces down
	public void functionWithBracesDown() {
		System.out.println("blarg");
	}

	// space before or after arguments/parameters
	public void functionSpacesInParams(String before, String after) {
		System.out.println("blarg");
	}

	// boolean value set to true
	public boolean booleanValue = true;
	public int intValue = 55;
	public long longValue = 129843597234L;

	public static final char myUtf8Char = '\uc2bc';

	public static String getName() {
		System.out.println();
		Scanner myScan = new Scanner(System.in); // 2. Create a Scanner object

		System.out.println("Please enter your name");

		String userName = myScan.nextLine(); // 3. Read the user input with .nextLine()

		System.out.println("So your name is: " + userName);
		return userName;
	}

	/*
	 * \t Tab character. \b Backspace character. \n Newline character. \r
	 * Carriage-return character. \f Form feed character. \' Single-quote character.
	 * \'' Double-quote character. \\ Backslash character.
	 * 
	 */

}
