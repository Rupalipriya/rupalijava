package org.learn.oops;

import java.util.ArrayList;
import java.util.Comparator;

public class Sortlist  {
	ArrayList<String> list=new ArrayList<String>(); 
	CompratorDemo compratorDemo=new CompratorDemo();
	
	void sort() {
	   
    list.add("Sachin Tendulkar");    
    list.add("Mahendra Dhoni");    
    list.add("Rohit Sharma");    
    list.add("Virat Kohli");
    list.sort(compratorDemo);
   System.out.println(list);
}

	public static void main(String[] args) {
		Sortlist sortlist=new Sortlist();
		sortlist.sort();
	}

	

}
