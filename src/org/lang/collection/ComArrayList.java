package org.lang.collection;

import java.util.ArrayList;

public class ComArrayList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("this");
		al.add("is");
		al.add("new");
		al.add("project");
		al.add("java");
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("again");
		al1.add("create");
		al1.add("new");
		al1.add("project");
		al1.add("java");
		ArrayList<String> al2=new ArrayList<String>();
		for(String str:al1) {
			if(al1.contains(str)) {
			//al2.add(al1.contains(str)? "yes":"no");
			System.out.println(str+ "is present");
			}
			else {
				System.out.println(str+ " is not present");
			}
		}
		//System.out.println(al2);
	}

}
