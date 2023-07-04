package org.lang.collection;

import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorDemo {

	public static void main(String[] args) {

		Vector<String> vt = new Vector<String>();
		vt.add("user");
		vt.add("add");
		vt.add("the");
		vt.add("new");
		vt.add("element");
		vt.add("vector");
		System.out.println(vt);

		ListIterator itr = vt.listIterator();
		System.out.println("Forward Direction:");
		while (itr.hasNext())
			
		{
			System.out.println(itr.next());
		}

		
		System.out.println("backward direction:");
		while (itr.hasPrevious())
			
		{
			System.out.println(itr.previous());
		}
	}

}
