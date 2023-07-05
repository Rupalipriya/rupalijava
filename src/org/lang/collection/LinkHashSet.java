package org.lang.collection;

import java.util.LinkedHashSet;

public class LinkHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("ar");
		lhs.add("ra");
		lhs.add("rm");
		lhs.add("mr");
		lhs.add("raaps");
		System.out.println(lhs);
		for(String s1:lhs) {
			System.out.println(s1);
		}
	
	}

}
