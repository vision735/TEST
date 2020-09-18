package toom;

import java.util.HashSet;

public class TestHashSetChatacterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<>();
		hs.add(5);
		hs.add(2);
		hs.add(3);
		System.out.println("测试set特点前----" + hs);
		System.out.println(hs.add(4));
		System.out.println(hs.add(4));// 是否可以重复？
		System.out.println(hs);// 有无序
	}

}
