package org.learn.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateRemove {
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("AAAA");
		al.add("RRR");
		al.add("HHHH");
		al.add("JJJJ");
		al.add("MMMM");
		al.add("YYY");
		al.add("HHHH");
		al.add("AAAA");
		System.out.println("Before removing Duplicates: "+al);
		
		HashSet<String> hashSet=new HashSet<String>();
		hashSet.addAll(al);
		System.out.println("After removing duplicate elemnts: "+hashSet);
	}

}
