package org.learn.collection;

import java.util.LinkedList;

public class SearchEleemnt {
	
	public static void main(String[] args) {
		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		
		linkedList.add(32);//0
		linkedList.add(21);//1
		linkedList.add(76);//2
		linkedList.add(12);//3
		
	int pos=linkedList.indexOf(76);
	System.out.println(pos);
	
	System.out.println(linkedList.subList(1, 4));//take a sublist
	}
	

}
