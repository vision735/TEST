package toom;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntrySetToGetValueMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<>();
		map.put("ABC001", "Kevin");
		map.put("ABC002", "Lily");
		map.put("ABC003", "Bob");
		map.put("ABC008", "Zombie1");
		map.put("ABC009", "Zombie8");
		map.put("ABC007", "Zombie3");
		map.put("ABC005", "Zombie4");
		Set<Map.Entry<String, String>> entrys = map.entrySet();// 获取所有中间人entrys
		// 遍历所有entrys用Map.Entry<String, String>类型的entry接收
		for (Map.Entry<String, String> entry : entrys) {

			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("ID:" + key + "--Name: " + value);
		}
	}
}
