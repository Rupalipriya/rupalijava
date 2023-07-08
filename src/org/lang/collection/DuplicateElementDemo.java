package org.lang.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateElementDemo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("rrr");
		al.add("uuu");
		al.add("ppp");
		al.add("aaa");
		al.add("nnn");
		al.add("ddd");
		System.out.println("before removing duplicate element:" +al);
		HashSet<String> hs=new HashSet<String>();
		hs.addAll(al);
		System.out.println("after removing duplicate element:"  +hs);
		for(String s3:hs)
		{
			System.out.println(s3);
		}

	}

}
