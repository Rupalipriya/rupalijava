package org.learn.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkListDemo {
	
	void m1() {
	
	LinkedList<Integer> linkedList=new LinkedList<Integer>();
	
	linkedList.add(32);
	linkedList.add(21);
	linkedList.add(76);
	linkedList.add(12);
	
	System.out.println("Original list: "+linkedList);
	
	linkedList.addFirst(44);//add element at first postion
	linkedList.addLast(66);////add element at last postion
	linkedList.add(2, 98);//add element at specific postion
	System.out.println(linkedList);
	
	linkedList.removeFirst();//
	linkedList.removeLast();
	linkedList.remove(3);
	System.out.println(linkedList);
	
//	linkedList.clear();//remove all elements from linklist
//	System.out.println(linkedList);
	
	System.out.println(linkedList.getFirst());//get the first element
	System.out.println(linkedList.getLast());//get the last element
	System.out.println(linkedList.get(2));//get the element from specific postion 4
	
	}
	
	public static void main(String[] args) {
		LinkListDemo linkListDemo=new LinkListDemo();
		linkListDemo.m1();
	}

}
