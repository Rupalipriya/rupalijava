package org.lang.collection;

import java.util.ArrayList;

public class ConArraylistToStringArray {

	public static void main(String[] args) {
		 //ArrayList declaration and initialization
	   ArrayList<String> a1=new ArrayList<String>();
	    a1.add("my");
	    a1.add("name");
	   a1.add("rupali");
	    a1.add("priya");

	    //ArrayList to Array Conversion
	    String arr[] = new String[a1.size()];
	    for(int i =0;i<a1.size();i++){
	      arr[i] = a1.get(i);
	   }
	//String arr[] = a1.toArray(new String[a1.size()]);
	    System.out.println(" ArrayList: "+ a1);
	    //System.out.println("Array Elements:");
	    //Displaying Array elements
	    for(String j: arr)
	    {
	      System.out.println(j);
	    }
	  }
	}


