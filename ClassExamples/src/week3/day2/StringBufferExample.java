package week3.day2;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abcdefghi");
		
		System.out.println(sb);
		
		// arg 1 = start index
		// arg 2 = end index
		// arg 3 = what to replace it with
		// this is doing 2 operations ... first is to delete the characters from position 0 to 5
		// then inserts the characters in the string at position 0 (start index) to 5 (end index)
		sb.replace(0, 5, "12345890");
		
		System.out.println(sb);
		
		System.out.println("sb length " + sb.length());
		
		//replace the last 3 values with XYZ
		sb.replace(sb.length()-3, sb.length(), "XYZ");
		sb.append("   hi there");
		System.out.println(sb);

		//this is one operation that adds the characters at position 0
		sb.insert(0, "ABCDE");
		
		System.out.println(sb);
	}

}
