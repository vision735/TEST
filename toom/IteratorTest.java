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
			System.out.println("��ӡ"+string);
		}
		System.out.println("------");
		
		for(Iterator iterator2 =collection.iterator();iterator2.hasNext();){//�÷���
			System.out.println("����Iterator����Collection��Ԫ�أ�"+iterator2.next());
		}
		
	}

}
