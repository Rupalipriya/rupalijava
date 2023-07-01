package org.learn.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AppendElements {

	
	public static void main(String[] args) {
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("AA");
		linkedList.add("BB");
		linkedList.add("CC");
		System.out.println(linkedList);
		
		List<String> list=new ArrayList<>();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		System.out.println(list);
		linkedList.addAll(list);//append list to linklist
		System.out.println(linkedList);
		System.out.println(linkedList.get(4));
	//	list.addAll(linkedList);
	//	System.out.println(list);//append linklist to list
		
	}
}
