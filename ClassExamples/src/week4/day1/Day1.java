package week4.day1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>();
		names.add("Larry");
		names.add("Steven");
		names.add("Eric");
		names.add("James");
		names.add("Jessica");
		names.add("Ellen");
		names.add("Bob");
		
		// 1) sort the original names list by length of string, using a stream.
		// 2) then sort secondary by alphabetical order
		
		Comparator<String> lengthComparison = ( a, b) -> a.length() - b.length();
		Comparator<String> alphComparison = (a, b) -> a.compareTo(b);
		
		List<String> lengthList = names.stream().sorted(lengthComparison).collect(Collectors.toList());;
		System.out.println(String.join("\n", lengthList));
		
		System.out.println("==============");
		
		List<String> alphList = lengthList.stream().sorted(alphComparison).collect(Collectors.toList());
		System.out.println(String.join("\n", alphList));
		System.out.println("==============");

		
		List<String> sortedList = names.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(String.join("\n", sortedList));
		
		System.out.println("==============");
		
		// remove all names from the list that contain an "n"
		sortedList.removeIf(name -> name.contains("n"));
		System.out.println(String.join("\n", sortedList));

		
	}

}
