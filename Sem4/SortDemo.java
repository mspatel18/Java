import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.HashSet;

public class SortDemo {
	public static void main(String args[]){
		// Sort Array
		int arr[] = {3,5,1,6,7,2};
		Arrays.sort(arr);
		System.out.println("Sorted array : " + Arrays.toString(arr));

		// Sort ArrayList
		List<Integer> arrayList = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));
        	Collections.sort(arrayList);
        	System.out.println("Sorted ArrayList: " + arrayList);

		// Sort a String
       	 	String str = "qwertyuiopasdfghjklzxcvbnm";
       	 	char[] chars = str.toCharArray();
        	Arrays.sort(chars);
        	String sortedStr = new String(chars);
        	System.out.println("Sorted String: " + sortedStr);

		// Sort a List
		List<String> list = new ArrayList<>(Arrays.asList("apple","banana","egg"));
		Collections.sort(list);
		System.out.println("Sorted List: " + list);

		//Sort a Map by keys
		Map<Integer,String> map = new HashMap<>();
		map.put(3,"apple");
		map.put(2,"egg");
		map.put(1,"banana");
		
		Map<Integer,String> sortedMap = new TreeMap<>(map);
        	System.out.println("Sorted Map by keys: " + sortedMap);
		
		//Set is already sorted

		Set<Integer> set = new HashSet<>(Arrays.asList(5,2,8,1,9));
		System.out.println("Set: "+ set);
	}
}