package org.learn.one;

public class Facbonacci { 
	int i, n1=1, n2=2, n3;
	void f1() {
		for(i=1;i<7;i++) {  	    
	    System.out.println("print " +n3);
	    	   n3 = n1 + n2;
	    	   n1 = n2;    
			      n2 = n3;
	       }  
	}
	public static void main(String[] args) {
		Facbonacci facbonacci=new Facbonacci();
		facbonacci.f1();
	}
}
