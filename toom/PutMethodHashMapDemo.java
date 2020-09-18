package toom;

import java.util.HashMap;

public class PutMethodHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<>();
		map.put("ABC001", "Kevin");// 添加方法
		map.put("ABC002", "Lily");
		System.out.println("键不重复时候---" + map);
		System.out.println(map.put("ABC001", "Clack")); // 此Key与第一个重复！！
		System.out.println("键重复时候---" + map);
	}

}
