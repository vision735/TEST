package toom;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection collection =new ArrayList();
		show(collection);
	}
	private static void show(Collection collection) {
		collection.add("aaaa");
		collection.add("bbbb");
		collection.add("cccc");
		collection.add("dddd");
		collection.add("eeee");
		System.out.println(collection);
		
	}
}
