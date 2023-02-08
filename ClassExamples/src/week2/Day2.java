package week2;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Day2 {
	public static void main(String[] args) {
		int a = 20;
		Integer convertintoInteger = a;
		char c = 'A';
		Character convertintoChar = c;
		
		double d = 565.23;
		Double convertintoDouble = d;
		
		/** ****************Notes for Week2 class 2 2/7/2023***********
		 *****Char class methods
		 *  isDigit(ch)
		 *	isLetter(ch) 
			isLetterOfDigit(ch) 
			isLowerCase(ch) 
			isUpperCase(ch) 
			toLowerCase(ch) 
			toUpperCase(ch)
			valueOf()
			valueOf(String s),
			valueOf(String s, int radix)
		 */
		
		
		//Use of escape characters examples
        System.out.println("***************escape characters***********************");
		System.out.print("Hello \nWelcome to"); //using \n
		System.out.println(" The \"Per Scholas\" Training institute."); //using \"
		System.out.println("This is a \'Java Developer\' Cohort."); //using \'
		System.out.println("My java file is in: projects\\src\\java"); //using \\
		
		
		// Lab 303.2 Java String Methods
		
		//.length() method
		String str1 = "Java";
        String str2 = "";

        System.out.println("***************length() method***********************");
        System.out.println(str1.length());  // 4
        System.out.println(str2.length());  // 0
        System.out.println("Java".length());  // 4
        System.out.println("Java\n".length()); // 5
        System.out.println("Learn Java".length()); // 10
        
        //.isEmpty() method
        String s1="";
        String s2="hello";
        System.out.println("***************isEmpty method***********************");
        System.out.println(s1.isEmpty());      // true
        System.out.println(s2.isEmpty());      // false
        
        //trim() method
        s1="  hello   "; 
        System.out.println("***************trim method***********************");
        System.out.println(s1+"how are you");        // without trim() 
        System.out.println(s1.trim()+"how are you"); // with trim() 
		
        //toLowerCase() method
        s1="HELLO HOW Are You?";
        System.out.println("***************toLowerCase method***********************");
        String s1lower=s1.toLowerCase();
        System.out.println(s1lower);
        
        //toUpperCase() method
        s1="hello how are you"; 
        System.out.println("***************toUpperCase method***********************");
        String s1upper=s1.toUpperCase(); 
        System.out.println(s1upper); 
        
        //concat() method
        	//------By using concat method----
        System.out.println("***************concat method***********************");
        str1 = "Learn ";
        str2 = "Java";
        	// concatenate str1 and str2
        System.out.println(str1.concat(str2)); // "Learn Java"

        	// concatenate str2 and str11
        System.out.println(str2.concat(str1)); // "JavaLearn "
        	//--- By using + operator---
        String s3 =  "hello";
        String s4 = "Learners";
        	//  String s5 = s3.concat(s4); or
           String s5 = s3 + s4;
           	//both of the above statement will give you the same result

           	// Three strings are concatenated
        String message = "Welcome " + "to " + "Java";

        	// String Chapter is concatenated with number 2
        String s = "Chapter" + 2; // s becomes Chapter2

        	// String Supplement is concatenated with character B
        s1 = "Supplement" + 'B'; // s1 becomes SupplementB
        
        //split() method
        String vowels = "a::b::c::d:e";

        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");

        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));
        
        //charAt() method
        message = "Welcome to Java";
        System.out.println("The first character in the message is " + message.charAt(0));
        
        //compareTo() method
        s1="hello";
        s2="hello";
        s3="hemlo";
        s4="flag";
        System.out.println("***************compareTo method***********************");
        System.out.println(s1.compareTo(s2)); // 0 because both are equal
        System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m"
        System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"
        /**The above program shows the comparison between the various Strings. Notice: 
        	if s1 > s2, it returns a positive number.
        	if s1 < s2, it returns a negative number.
        	if s1 == s2, it returns 0.
        */

        //substring() method
        	//The substring() method extracts a substring from the string and returns it. The syntax of the substring() method is
        	//stringObj.substring(int startIndex, int endIndex)
        str1 = "java is fun";

        // extract substring from index 0 to 3
        System.out.println(str1.substring(0, 4));
        
        //indexOf() method
        
        str1 = "Java is fun";
        int result1;

        // getting index of character 's'
        result1 = str1.indexOf('s');

        System.out.println(result1); // 6

        // getting index of character 'J'
        result1 = str1.lastIndexOf('J');
        System.out.println(result1); // 0

        // the last occurrence of 'a' is returned
        result1 = str1.lastIndexOf('a');
        System.out.println(result1); // 3

        // character not in the string
        result1 = str1.lastIndexOf('j');
        System.out.println(result1); // -1

        // getting the last occurrence of "ava"
        result1 = str1.lastIndexOf("ava");
        System.out.println(result1); // 1

        // substring not in the string
        result1 = str1.lastIndexOf("java");
        System.out.println(result1); // -1
        
//>>         
        //contains() method
        System.out.println(">>>>>>>>>>>>>>>>>> contains() method");
        str1 = "Learn Java";
        Boolean resultBool;
        resultBool = str1.contains("Java");
        System.out.println(resultBool);  // true

        // check if str1 contains "Python"
        resultBool = str1.contains("Python");
        System.out.println(resultBool);  // false

        // check if str1 contains ""
        resultBool = str1.contains("");

        System.out.println(resultBool);  // true
        
//>>   
        // replace() method
        	/**The syntax of the replace() method is either:
			stringobj.replace(char oldChar, char newChar) or
			stringobj.replace(CharSequence oldText, CharSequence newText)
			Here, stringobj is an object of the String class.
        	 */
        str1 = "abc cba";
        // all occurences of 'L' is replaced with 'J'
        System.out.println("***************replace() method***********************");
        System.out.println("Lava".replace('L', 'J'));  
        // character not in the string
        System.out.println("Hello".replace('4', 'J')); 
        // all occurrences of "C++" is replaced with "Java"
        System.out.println(str1.replace("C++", "Java"));  


        // all occurences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz"));

        // substring not in the string
        System.out.println("Java".replace("C++", "C")); 
        
        /**
         * Output
			zbc cbz
			Java
			Hello
			abc cba
			zz bb zz zz
			Java

			Note: If the substring to be replaced is not in the string, replace() returns the original string.
         */
        
        //.equals() method
        //compares the original content of the string with input argument
        s1="PerScholas";
        s2="PerScholas";
        s3=new String("PerScholas");
        s4="Teksystem";
        System.out.println("***************equal method***********************");
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true 
        System.out.println(s1.equals(s4));//false
        //Output is
        //true
        //true
        //false
        
        //this compares the reference instance, if they are the same it will return true, if not then false
        System.out.println(s1==s2);//true (because both refer to same instance)
        System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)
        
        //compareTo() method
        s1="Perscholas";
        s2="Perscholas";
        s3="Perschola";
        System.out.println("***************compareTo method***********************");
        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s3));//1(because s1>s3)
        System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )
        
        Day2 d2 = new Day2();
        d2.autobox();
        d2.character();
        d2.escapeSequence();
        d2.stringsEqual();
        d2.stringJoinerExample();
        d2.formatting();
	}
	
	public static void autobox() {
		// for the most part a primitive and a warpper class are interchangeable with no worries
		int a = 50;
		Integer i = a;
		
		//as a primitive a does not have any function on it
//		a.isDigit() would not run
		//but as a wrapper class it does functions/methods
		i.doubleValue();
		i.longValue();
		
		//the wrapper class allows you to set it to null which means it has no value
		//this can not be done with a primitive : a = null; will not compile
		Integer n = null;
		if (n == null) {
			//do some code
		}
	}
	
	public void character() {
		//all 
		char d = 'D';
		
		//using the wrapper class
		Character c = 'C';
		System.out.println("The lowercase of Z is " + Character.toLowerCase('Z'));
		
		System.out.println("The char C is a digit? " + Character.isDigit('C'));
		System.out.println("The char 1 is a digit? " + Character.isDigit('1'));

	}
	
	public void escapeSequence() {
		System.out.println("The is a string with a \" and a \\ in it");
		System.out.println("The is a string with a new line character \n in it");
		System.out.println("The is a string with a tab\t in it and 4 spaces ->    <-");

	}
	
	public void stringsEqual() {
		// for the sake of this course and what we are doing here ALWAYS use the .equals() method
		//to compare if 2 strings are the same
		
		String a = "abcd";
		String b = "wxyz";
		
		if( a == b) {//WARNING : DOING THIS INCORRECTLY WILL PRODUCE A BUG IN YOUR CODE
			//SOMETIMES IT WILL BE TRUE AND SOMETIMES FALSE
			//this will be false because java compares the memory location instead of the value
			//this is different than how it works with primitives which is compared by value
			System.out.println("running ab comparison");
		}
		
		if(a.equals(b)) {
			//this will compare the value of a and b and only if the values are equal will it enter this block
			//this block will not execute
		}else {
			System.out.println("This will evaluate to false because the value of a is not equal to the value of b");
		}	
	}
	
	public void numberToStringConversion() {
		String str = "123";
		
	}
	
	public void stringBufferMethod() {
		//string buffer is an object that is mutable
		StringBuffer str = new StringBuffer();
		
		str.append("abc");
		str.append("xyz");
		
		System.out.println(str);
		
		//java is not creating a new string each time
		//this will actually create 3 strings in memory, then garbage collect the first two
		// 1) abc
		// 2) xyz
		// 3) abcxyz
		String x = "abc" + "xyz";
	}
	
	public void stringJoinerExample() {
		StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter
		
		joinNames.add("Java");
		joinNames.add("Python");
		joinNames.add("C Sharp");
		joinNames.add("JavaScript");
		
		System.out.println(joinNames);
		
		//without a string joiner
		//make a list with 4 items and I want them to print out the same as above
		
		//ctrl + shift + o >>>>> keys import 
		List<String> lng = new ArrayList<>();
		lng.add("Java");
		lng.add("Python");
		lng.add("C Sharp");
		lng.add("JavaScript");
		
		for(int i = 0; i < lng.size(); i++) {
			System.out.print(lng.get(i));
			if(i <= lng.size() - 1) {
				System.out.print(",");
			}
		}
	}
	
	public void formatting() {
		int i = 1024;
		byte b = 127;
		double d = 1.232;
		double tiny = d/100000000.0;
		
		//this is hard to read
		System.out.format("this is an integer: %d and this is a byte: %d,\n", i, b);
		
		//this is easier to read
		System.out.println("This is an integer: " + i + " and this is a byte: " + b);
		
		//this notation is on the SBA i think.... maybe it has changed, probably not
		//FOR KBA &&&& will need to know how to format a decimal number to 2 places
		//******* This notation you must know ******
		System.out.format("this is a double: %.4f and this is tiny: %f,\n", d, tiny);
		System.out.format("this is a double: %.2f and this is tiny: %.4e.,\n", d, tiny);
		
		
		//Learn this was and do this on the KBA!!!!!
		//this is how you will do it on the job. if you can, do it this way on the SBA
		//******of all this... this is the important way to know how to do!!!!!!!!!!!!!!!!!
		double number = 123579890.123;
		String pattern = "##,###,###.##";
		DecimalFormat numberFormat = new DecimalFormat(pattern);
		System.out.println("Using decimal format " + numberFormat.format(number));
		
		
	}
	
	
	//know the Math Object (class) exists and has methods that are convenient
	
	
}
