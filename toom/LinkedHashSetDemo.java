package toom;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new LinkedHashSet();
		hs.add("hahah");
		hs.add("hehe2222");
		hs.add("heihei");
		hs.add("xixii");
		hs.add("hehe2222"); // �����ظ����
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
