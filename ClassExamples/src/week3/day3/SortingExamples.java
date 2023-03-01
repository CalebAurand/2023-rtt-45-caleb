package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingExamples {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(7);
		list.add(18);
		list.add(3);
		list.add(2);
		list.add(9);
	
		System.out.println("Before sort : " + list);
		
		Collections.sort(list);
		
		System.out.println("After sort : " + list);
		
		// a comparator is just an interface and we are implementing it
		class NumberComparator<Integer> implements Comparator<Integer> {
		  //comparator returns one of 3 values
		  //if o1 < o2 then return -1
		  //if o1 > o2 then return 1
		  //if o2 == o2 then return 0
	
		  @Override
		  public int compare(Integer o1, Integer o2){
		    //TODO Auto-generated method stub
		    return 0;
		  }
		}
	}
}
