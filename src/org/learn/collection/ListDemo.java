package org.learn.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	
	void m1() {
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(2);//0
		list1.add(5);//1
		list1.add(6);//2
		list1.add(5);//3
		list1.add(2, 10);//parrticular index
		System.out.println(list1);//[2,5,10,6,5]
	}
	
	public static void main(String[] args) {
		ListDemo listDemo=new ListDemo();
		listDemo.m1();
	}

}
