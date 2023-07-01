package org.learn.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumartionDemo {

	
	public static void main(String[] args) {
	Vector<Integer> vector=new Vector<>();
    vector.add(23);
    vector.add(24);
    vector.add(98);
    vector.add(65);
    vector.add(54);
    System.out.println(vector);
   
    Enumeration e = vector.elements();
	while(e.hasMoreElements()) {
	System.out.println(e.nextElement());
	
}
	}
}
