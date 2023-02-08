package week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Day3 {
	
	public void whileEx() {
		int i = 0;

        while (i < 3) {
            System.out.println("Value of i = " + i);
            i++;
        }

	}
	
	public void forEx() {
		int sum = 0;
		for(int i = 1; i<=500; i++) {
			System.out.println("i is: " + i);
			sum += i;
		}
		System.out.println(sum);
	}
	
	public void doWhileEx() {
		int i = 1;
		do {	
		  System.out.println(i);
		  i++;
		} while(i<=10);
	}
	
	public void breakExample() {
		int sum = 0;
	       int number = 0;
	       while (number < 20) {
	           number++;
	           sum += number;
	           if (sum >= 100) {
	               break;
	           }
	       }
	       System.out.println("The number is " + number);
	       System.out.println("The sum is " + sum);
	}
	
	public void setInside() {
		for(int i = 0; i<=10; i++) {
			System.out.println("value of count =  " + i);
			i = 10;
		}
	}
	
	public void homeworkLoop() {
		//examples loop from 10 to 30 showing even numbers only and using continue
		//loop from 10 to 1 showing all numbers
		//loop from 10 to 30 and break when you find the first number divisible by 3
		
		//for loop
		for(int index=10; index<=30; index++) {
			if(index % 2 == 1) {continue;}
			System.out.println("index = " + index);
		}
		//while loop
		int count = 10;
		while(count > 0) {
			System.out.println("Count = " + count);
			count--;
		}
		//do while loop
		int iterate = 10;
		do {
			System.out.println("iterate = " + iterate);
			if(iterate % 3 == 0) {break;}
			iterate++;
		}while(iterate <= 30);
	}
	
	
	//position : 0 contains "String 1"
	//position : 1 contains "String 2"
	//position : 2 contains "String 3"
	public void forLoopList() {
		List<String> list = new ArrayList<>();
		list.add("String 1");
		list.add("String 2");
		list.add("String 3");
		
		//loop over the list and print the elements
		//this loop (on list) style is used when you need to know the position of each element
		//for some sort of business logic ... this does happen time to time
		for(int index=0; index<list.size(); index++) {
			System.out.println("value of index is " + index);
			System.out.println(list.get(index));
		}
		
		//new style for loop that is easier to read and used more commonly
			//for each element in the list>>>do this code
		for(String element : list) {
			System.out.println(element);
		}
	}
	
	//Exercise for Lists
	//create a List of Integers and use a loop to add the numbers 1 to 10 to the list.
	//Then use the new style for the loop to print the elements in the list.
	
	public void listExercise(int start, int end) {
		List<Integer> numList = new ArrayList<>();
		int iterator = start;
		while(iterator <= end) {
			if(iterator <= 10) {
				numList.add(iterator);
				iterator++;
				continue;
			}
			if(iterator % 2 == 1) {
				numList.add(iterator);
			}
			iterator++;
		}
		for(int element : numList) {
			System.out.println("The number is: " + element);
		}
	}
	
	//Exercise ... make this take 3 parameter inputs
	//the min random value, the max random value, and the total size of the list
	//ex we pass in maxRandomValue(1, 100, 10)
	public void maxRandom(int smallest, int largest, int length) {	
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<length; i++) {
			Random random = new Random();
			int randomNum = random.nextInt(largest-smallest) + smallest;
			
			list.add(randomNum);
			System.out.println(randomNum);
		}
		
		int minValue = list.get(0);
		int maxValue = 0;
		for(Integer r : list) {
			if(r < minValue) {
				minValue = r;
			};
			if(r > maxValue) {
				maxValue = r;
			};
		}
		System.out.println("Min value: " + minValue + " Max value: " + maxValue);
	}
	
	public void createArray() {
		//notice that we are using a new
		
		
		// here we use () to create a new object which is essentially call the 
		//constructor of the object
		String str = new String();
		
		//not here when we are creating an array we are not using () because we need to
		//specify the 
		//array size using []
		
		String[] strings = new String[10];
		
		strings[0] = "a"; //pos 0
		strings[1] = "b"; //pos 1
		strings[2] = "c"; //pos 2
		strings[9] = "z";
		
		//to a value from teh arrray we use
		System.out.println(strings[2]);
		
		//if we do this iwth a list
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		System.out.println(list.get(2));
				
		//creating an array with constants
		int[] constants = {1, 5, 7, 9, 19};
		String[] fileExt = {".jpg", ".txt", ".exe"};
		
		//first we look at old for loop on array
		for(int pos = 0; pos < strings.length; pos++) {
			System.out.println(strings[pos]);
		}
		
		System.out.println("=================================");
		
		for(String s : strings) {
			System.out.println(s);
		}
		
		int len = 10;
		int[] lenArray = new int[len];
	}
	
	public void arrayRandomValue(int min, int max, int length) {
		int largest = min;
		int smallest = max;
		int[] randArray = new int[length];
		for(int i=0; i < length; i++) {
			Random randomGen = new Random();
			int randomNum = randomGen.nextInt(max-min)+min;
			randArray[i] = randomNum;
			if(randomNum > largest) {largest = randomNum;}
			if(randomNum < smallest) {smallest = randomNum;}
			System.out.println("random array number i: " + i + " number: " +randomNum);
		}
		System.out.println("smallest: "+smallest+" largest: "+largest);
	}
	
	public static void main(String[] args) {
		Day3 obj3 = new Day3();
		
//		obj3.forEx();
//		obj3.whileEx();
//		obj3.doWhileEx();
//		obj3.breakExample();
//		obj3.homeworkLoop();
//		obj3.forLoopList();
//		obj3.listExercise(1, 50);
//		obj3.listExercise(-4, 0);
//		obj3.listExercise(60, 75);
//		obj3.maxRandom(1, 100, 10);
//		obj3.createArray();
		obj3.setInside();
		obj3.arrayRandomValue(1, 100, 15);
		
		
//		for(int count = 1; count <= 10; count++) {
//			if(count % 2 == 1) {
//				//this gets us odd nubers
//				continue;
//			}
//			System.out.println("Value of count = " + count);
//		}
	}
}
