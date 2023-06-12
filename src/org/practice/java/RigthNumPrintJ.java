package org.practice.java;
/*
 * 1
   1 2
   1 2 3
   1 2 3 4
   1 2 3 4 5

 */
public class RigthNumPrintJ {
void print() {
	for(int i=0;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(" " +j);
	}
	System.out.println();	
	}
}
	public static void main(String[] args) {
		RigthNumPrintJ rigthNumPrintJ=new RigthNumPrintJ();
		rigthNumPrintJ.print();
	}

}
