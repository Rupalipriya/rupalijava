package org.lang.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	void l1() {
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(2);
		list1.add(null);
		list1.add(56);
		list1.add(2);
		list1.add(8);
		System.out.println(list1);
		for(Integer  ListDemo : list1) {
			System.out.println(ListDemo);
		}
	}

	public static void main(String[] args) {
		ListDemo listDemo=new ListDemo();
		listDemo.l1();
  
	}

}
