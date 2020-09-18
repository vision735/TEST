package toom;

import java.util.HashMap;
import java.util.Set;

public class GetKeyMethodHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<>();
		map.put("ABC001", "Kevin");
		map.put("ABC002", "Lily");
		map.put("ABC003", "Bob");
		map.put("ABC004", "Zombie");
		// Set<K> keySet() 获取key
		Set<String> keys = map.keySet();
		System.out.println("Hashmap获取键key:");
		for (String key : keys) {
			System.out.println(key);
		}
	}

}
