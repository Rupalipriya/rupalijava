package org.lang.collection;

import java.util.LinkedList;

public class LinkedListDemo {

	void l1(){
		
	LinkedList<String> linklist=new LinkedList<String>();
	linklist.add("hi");
	linklist.add("hello");
	linklist.add("linked");
	linklist.add("by");
	linklist.add("list");
	System.out.println(linklist);
	for(String s1:linklist) { //using foreach loop
		System.out.println(s1);
	}
		
	}
	public static void main(String[] args) {
		LinkedListDemo linkedListDemo=new LinkedListDemo();
		linkedListDemo.l1();
	}

}
