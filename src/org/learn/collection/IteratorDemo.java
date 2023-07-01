package org.learn.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		for (int i=0; i<=10; i++) {
		l.add(i);
		}
		System.out.println(l);
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
		Integer I = (Integer)itr.next();
		System.out.println(I);
		}

}
}
