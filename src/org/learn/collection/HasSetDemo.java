package org.learn.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HasSetDemo {
	
	public static void main(String[] args) {
		//Set<String> set=new HashSet<String>();
		HashSet<String> hashSet=new HashSet<String>();//deafult capacity 16
		HashSet<String> hashSet1=new HashSet<String>(20);//capacity with 16
		HashSet<String> hashSet2=new HashSet<String>(20,60);//capacity and loadfactor with 60%
		ArrayList<String> al=new ArrayList<String>();
		al.add("hhhh");
		al.add("llll");
		al.add("llll");
	    hashSet.add("AAA");
		hashSet.add("tttt");
		hashSet.add("yyyy");
		hashSet.add("pppp");
		hashSet.add("RRRR");
	    hashSet.add("pppp");
	    hashSet.add(null);
	    hashSet.remove("pppp");
		System.out.println("Before adding list: "+hashSet);
		
		hashSet.addAll(al);
		System.out.println("After adding list: "+hashSet);
		
		for (String s1 : hashSet) {
			System.out.println(s1);
			
		}
	}

}
