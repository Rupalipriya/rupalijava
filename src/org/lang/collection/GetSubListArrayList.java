package org.lang.collection;

import java.util.ArrayList;

public class GetSubListArrayList {

	public static void main(String[] args) {
		try {
			ArrayList<String> al=new ArrayList<String>();
			al.add("we");
			al.add("can");
			al.add("do");
			al.add("it");
			System.out.println(al);
			ArrayList<String> al1=new ArrayList<String>();
			al1.addAll(al.subList(1, 3));
			System.out.println(al1);
		}
		catch(Exception e){
			e.getMessage();
		}
	}
	}


