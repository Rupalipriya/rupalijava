package org.learn.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Ram");
		list.add("Shyam");
		list.add("Bharat");
		list.add("Lakshman");
		list.add("Satrudhan");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}
