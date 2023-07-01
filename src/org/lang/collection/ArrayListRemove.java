package org.lang.collection;

import java.util.ArrayList;

public class ArrayListRemove {
	void removearray() {
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(45);
		list2.add(23);
		list2.add(34);
		list2.add(56);
		list2.add(78);
		System.out.println(list2);
		list2.remove(3);
		list2.add(3, 80);
		list2.remove(4);
		list2.add(4, null);
		System.out.println("after  remove or add " +list2);
	}

	public static void main(String[] args) {
		ArrayListRemove arrayListRemove =new ArrayListRemove();
		arrayListRemove.removearray();
	}

}
