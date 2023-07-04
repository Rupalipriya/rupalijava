package org.lang.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemoR {

	
	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("vec");
		v.add("add");
		v.add("element");
		v.add("specific");
		System.out.println(v);
		v.remove(3);
		v.remove(1);
		v.add(1, "allelement");
		v.remove("element");
		
		System.out.println("after removing element: " +v);
		
		 Enumeration e = v.elements();
			while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		
			}
	}

	}
