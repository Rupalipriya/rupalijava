package org.lang.collection;

import java.util.ArrayList;

public class IterateArray {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(23);
		al.add(32);
		al.add(73);
		al.add(29);
		al.add(52);
		System.out.println(al);
		for(Integer it:al) {
			System.out.println(it);
			if(it==73) {
				it=it+5;
				System.out.println("after adding the value:" +it);
			}
		}

	}
}

