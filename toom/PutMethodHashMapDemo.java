package toom;

import java.util.HashMap;

public class PutMethodHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<>();
		map.put("ABC001", "Kevin");// ��ӷ���
		map.put("ABC002", "Lily");
		System.out.println("�����ظ�ʱ��---" + map);
		System.out.println(map.put("ABC001", "Clack")); // ��Key���һ���ظ�����
		System.out.println("���ظ�ʱ��---" + map);
	}

}
