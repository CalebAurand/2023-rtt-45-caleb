package week3.day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// Map<KeyType, ValueType>
		// is Map<K, V>
		//this is a map with string as a key and string as a value
		Map<String, String> strMap = new HashMap<>();
		strMap.put("key", "value");
		strMap.put("concat", "To add 2 strings together");
		strMap.put("instantiate", "to create a new object");
		
		System.out.println(strMap.get("concat"));
		System.out.println(strMap.entrySet());
		
		Set<String> keySet = strMap.keySet();
		for ( String key : keySet) {
			System.out.println( "strMap key : " + key);
			System.out.println( "strMap " + key + " value : " + strMap.get(key));
		}
		
		
		
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++
		
		//this is a map with string as a key and integer as a value
		Map<String, Integer> intMap = new HashMap<>();
		intMap.put("key", 1);
		
		System.out.println("\nstrMap : " + strMap.entrySet());
		
		// this is a map with the key as an integer and string as a value
		Map<Integer, String> sintMap = new HashMap<>();
		sintMap.put(1, "a");
		sintMap.put(2, "b");
		sintMap.put(3, "c");
		sintMap.put(4, "four");
		sintMap.put(5, "five");
		sintMap.put(6, "six");
		
		/*The keys are a set, they can not contain any dublicate keys*/
		
		System.out.println("\nvalue at key 3 : " + sintMap.get(3));
		sintMap.put(3, "THREE");
		System.out.println(sintMap.get(3));
		System.out.println();
		System.out.println(sintMap.entrySet());
		
		
		for (Integer key : sintMap.keySet()) {
			System.out.println("sintMap key : " + key);
		}
		
		String word = "abcd";
		
		String newWord = word.substring(word.length()-2, word.length());
		System.out.println("newWord is " + newWord);
        String result = newWord.substring(1,2)+ newWord.substring(0,1);
        System.out.println( result);
		
	}

}
