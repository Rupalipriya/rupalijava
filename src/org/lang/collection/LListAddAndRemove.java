package org.lang.collection;

import java.util.LinkedList;

public class LListAddAndRemove {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("rupali");
		list.add("23");
		list.add("32");
		list.add("priya");
		list.add("srivastav");
		System.out.println("origin element:"+list );
		list.addFirst("12");
		list.addLast("anand");
		list.add(2, "16");
		System.out.println("print after adding some element:" +list);
		list.removeLast();
		list.removeFirst();
		list.remove(3);
		System.out.println("print after removing:" +list);
		for(String s2: list) {
			System.out.println(s2);
		}
	}

}
