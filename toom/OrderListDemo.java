package toom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list =new ArrayList<>();
		list.add("a1");
		list.add("e2");
		list.add("rr3");
		list.add("tt4");
		list.add("sdfs5");
		list.add(1,"aaaaaaa");
		list.remove(2);
		list.set(3, "替换");
		
		System.out.println("测试List集合的有效性");
		for(Object o:list)
		{
			System.out.println(o);
		}
		
		System.out.println("list:"+list.toString());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Iterator it =list.iterator();
		while(it.hasNext()) {
			System.out.println("迭代器"+it.next());
		}
		
	}

}
