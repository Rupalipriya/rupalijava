package org.learn.collection;

import java.util.ArrayList;

public class ArrayListDemo {
	
	void useArrayList() {
		ArrayList<String> list=new ArrayList<String>();//Arraylist creation
		System.out.println("Before inserting:"+list.size());
		list.add("AAA");
		list.add("hhhh");
		list.add("yyyy");
		list.add("llll");
		System.out.println("after inserting"+list.size());
		System.out.println(list);//print the list
		list.add(0,"kkkk");
		System.out.println("After adding element"+list);
		list.remove("AAA");//kkk,hhh,yyy,lll
		list.remove(2);//kkk,hhh,lll
		System.out.println("After deleting :"+list);
	}
	
	public static void main(String[] args) {
		ArrayListDemo al=new ArrayListDemo();
		al.useArrayList();
	}

}
