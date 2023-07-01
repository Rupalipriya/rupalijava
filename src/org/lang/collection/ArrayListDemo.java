package org.lang.collection;

import java.util.ArrayList;

public class ArrayListDemo {
	void usearraylist() {
		ArrayList<Integer> arlist=new ArrayList<Integer>();
		System.out.println("before inserting " +arlist.size());
		arlist.add(3);
		arlist.add(24);
		arlist.add(5);
		arlist.add(9);
		arlist.add(10);
		System.out.println(arlist);
		arlist.add(2, 45);//(int index,addaelement)after 2 indexadd 45 element
		arlist.add(4, 8);
		System.out.println("print after adding element " +arlist);
		for(Integer  ListDemo1:arlist){
		System.out.println(ListDemo1);
		}
		
	}

	public static void main(String[] args) {
		ArrayListDemo  arrayListDemo =new ArrayListDemo();
		 arrayListDemo.usearraylist();

	}

}
