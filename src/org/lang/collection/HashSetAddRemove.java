package org.lang.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetAddRemove {

	public static void main(String[] args) {
		HashSet<String> sh=new HashSet<String>();
		ArrayList<String> al=new ArrayList<String>();
		al.add("aaa");
		al.add("bbb");
	    al.add("ccc");
	    al.add("ddd");
	    System.out.println("before adding hashset:" +sh);
	    sh.add("hhh");
	    sh.add("cmd");
	    sh.add("ooo");
	    sh.add("aaa");
	    sh.add("ppp");
	    sh.add("lmn");
	    sh.remove("aaa");
	    
	    System.out.println("after adding hashset:" +sh  );
	    for(String s2:sh) {
	    	System.out.println(sh);
	    	
	    }
	}

}
