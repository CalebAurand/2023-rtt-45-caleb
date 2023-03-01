package week3.day2;
import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner sj1 = new StringJoiner(":", "{", "}");
		
		sj1.add("element1");
		sj1.add("element2");
		sj1.add("element3");
		sj1.add("element4");
		
		// the primary use of a string joiner is to create a csv file
		//a CSV file is a file in which the data is separated by commas,
		//or by some other delimiter
		
		System.out.println(sj1.toString());
		
		StringJoiner sj2 = new StringJoiner(",", "[", "]");
		
		sj2.add("list1");
		sj2.add("list2");
		sj2.add("list3");
		sj2.add("list4");
		
		System.out.println(sj2.toString());
		
		//by using the merge function it still used the delimiter and start and end characters from sj1
		//the only thing it did was merge the elements of sj2 and sj1
//		System.out.println(sj1.merge(sj2).toString());
		
		//sj2 merging with sj1 instead
		System.out.println(sj2.merge(sj1).toString());
	}

}
