package org.learn.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
			LinkedList<String> l = new LinkedList();
			l.add("Baala");
			l.add("Venki");
			l.add("Chiru");
			l.add("Naag");
			System.out.println(l);
			ListIterator<String> ltr = l.listIterator();
			while(ltr.hasNext()) {
			String s = (String)ltr.next();
			System.out.println(s);
			ltr.remove();
			ltr.add("Chaitu");
			ltr.add("Charan");
			}
			System.out.println(l);
	}
	
}
