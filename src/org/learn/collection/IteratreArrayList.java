package org.learn.collection;

import java.util.ArrayList;

public class IteratreArrayList {

	public static void main(String[] args) {
      ArrayList<Integer> al=new ArrayList<Integer>();
      al.add(23);
      al.add(44);
      al.add(32);
      al.add(77);
   //   System.out.println(al);
		for(Integer i:al) {
			System.out.println(i);
			if(i==44) {
				i=i+5;
				System.out.println("After adding the value: "+i);
			}
		}
		
	}

}
