package org.learn.collection;

import java.util.ArrayList;
import java.util.List;

public class SubList {
	
	
	 public static void main(String a[]){
		    try {
		      ArrayList<String> al = new ArrayList<String>();

		      //Addition of elements in ArrayList
		      al.add("Steve");
		      al.add("Justin");
		      al.add("Ajeet");
		      al.add("John");
		      al.add("Arnold");
		      al.add("Chaitanya");

		      System.out.println("Original ArrayList Content: " + al);
		      
		     ArrayList<String> al2=new ArrayList<>();
		  al2.addAll(al.subList(0, 3));
		     System.out.println(al2);

		    }
		    
		   
		    catch (Exception e) {
				// TODO: handle exception
		    	e.getMessage();
			}
	 }
}
