import java.util.*;

public class CollectionDemo {
   public static void main(String[] args) {

        // ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("cherry");
        System.out.println("ArrayList: " + arrayList);

        // LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("cherry");
        System.out.println("LinkedList: " + linkedList);

        // LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("apple", 1);
        linkedHashMap.put("banana", 2);
        linkedHashMap.put("cherry", 3);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("apple", 1);
        treeMap.put("banana", 2);
        treeMap.put("cherry", 3);
        System.out.println("TreeMap: " + treeMap);

        // HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("cherry");
        System.out.println("HashSet: " + hashSet);
	
	// Create
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("Names: " + names);

        // Read
        String name = names.get(1);
        System.out.println("Name at index 1: " + name);

        // Update
        names.set(1, "Bob Updated");
        System.out.println("Names after update: " + names);

        // Delete
        names.remove(2);
        System.out.println("Names after delete: " + names);
	}
}