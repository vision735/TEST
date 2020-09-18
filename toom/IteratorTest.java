package toom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> collection =new ArrayList<String>();
		collection.add("a");
		collection.add("51");
		collection.add("pp");
		collection.add("ya");
		
		Iterator<String> iterator =collection.iterator();
		while(iterator.hasNext()) {
			String string =(String) iterator.next();
			System.out.println("打印"+string);
		}
		System.out.println("------");
		
		for(Iterator iterator2 =collection.iterator();iterator2.hasNext();){//用法二
			System.out.println("测试Iterator遍历Collection的元素："+iterator2.next());
		}
		
	}

}
