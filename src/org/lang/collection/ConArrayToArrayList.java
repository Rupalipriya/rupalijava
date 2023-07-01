package org.lang.collection;



import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;

public class ConArrayToArrayList {

	public static void main(String[] args) {
		String arr[]= {"agra","talmahal","place"};
		/*List<String> l= Arrays.asList(arr);
		System.out.println(l);
		for(String s:arr) {
			System.out.println(s);
		}*/
		/*ArrayList<String> al=new ArrayList<String>();
		Collections.addAll(al, arr);
		System.out.println(al);
		for(String s1:arr) {
			System.out.println(s1);
		}*/
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<arr.length;i++) {
			al.add(arr[i]);
		
		}
		System.out.println(al);
		for(String s2:arr) {
	     System.out.println(s2);
		}
		}
	}


