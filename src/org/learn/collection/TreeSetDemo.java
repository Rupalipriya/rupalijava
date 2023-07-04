package org.learn.collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> treeSet=new TreeSet<>();//empty treeset
		//treeSet.add(null);
		treeSet.add("ddd");
		treeSet.add("tttt");
		treeSet.add("yyy");
		treeSet.add("eee");
		treeSet.add(null);
		treeSet.add("hhhh");
		System.out.println(treeSet);
	}
	
}
