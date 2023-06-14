package org.practice.java;
/*
 * WAP in java to copy all elements of 1 array into another array.
 */
public class CopyArray2D {
	void copyarrayin2d() {
	int a[][]= {{2,3,4,5},{3,4,5,2}};
	
	for(int i=0;i<4;i++) {
		for(int j=0;j<4;j++) {
			System.out.print(a[i][j]+ " ");
		}
		System.out.println();
	}
	}

	public static void main(String[] args) {
		CopyArray2D copyArray2D=new CopyArray2D();
		copyArray2D.copyarrayin2d();          

	}

}
