import java.util.HashMap;
import java.util.Map;

public class PlayMap {
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> integerMap = new HashMap<Integer, Integer>();
		integerMap.put(1, 1);
		integerMap.put(2, 2);
		integerMap.put(3, 3);
		integerMap.put(4, 4);
		integerMap.put(5, 5);
		
		
		Map<Integer, String> stringMap = new HashMap<Integer, String>();
		stringMap.put(1, "one");
		stringMap.put(2, "two");
		stringMap.put(3, "three");
		stringMap.put(4, "four");
		stringMap.put(5, "five");
		
		Map<String, String> nameMap = new HashMap<String, String>();
		nameMap.put("FirstName", "Mark");
		nameMap.put("LastName", "Wahlberg");
//		nameMap.put("FirstName", "Mark");
//		nameMap.put("FirstName", "Mark");
//		nameMap.put("FirstName", "Mark");
		
		System.out.printf("Name Map Tests: size is %d and is empty %b\n", nameMap.size(), nameMap.isEmpty());
		
		for(Map.Entry<String, String> m: nameMap.entrySet()) {
			System.out.printf("Key: %s Value %s\n", m.getKey(), m.getValue());
		}
		
		integerMap.clear();
		stringMap.remove(1);
		stringMap.clear();
		nameMap.clear();

	}


}
