package org.lang.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		//Set<String> set=new HashSet<String>();
		HashSet<String> hs=new HashSet<String>();
		hs.add("user");
		hs.add("element");
		hs.add("hash");
		hs.add("set");
		hs.add("use");
		System.out.println(hs);
		for(String st:hs) {
			System.out.println(st);
		}
		

	}

}
