package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {
	public static void main(String[] args) {
		
		//basic operations in hashmap
		
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Tom");
		map.put(102, "David");
		map.put(103, "Peter");
		map.put(104, "Kavya");
		map.put(105, "Vastav");
		map.put(106, "chandan");
		// size of the map
		System.out.println("Size of the map is:" + map.size());

		// keys
		System.out.println("keys are:" + map.keySet());

		// values
		System.out.println("Value sare :" + map.values());

		// print true
		System.out.println(map.containsKey(102));

		// print false
		System.out.println(map.containsKey(100));

		// prints the value corresponding to the key 101
		System.out.println(map.get(101));

		// print all the entries ion the map using for each loop
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + "  " + m.getValue());
		}
		
		//map.replace(103, "arun");
		
		//System.out.println(map);

	}
}
