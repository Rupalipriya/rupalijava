package org.practice.java;
/*
 * WAP in java to add matrix using multidimentional array (2d).
 */
public class MatrixArrayInTwoD {
	void matrixarray() {
		int add=0;
        int a[][]= {{2,3,4,5,6},{1,2,3,4,5}};
     //   2 3 4 5 6
     //   1 2 3 4 5
		for(int i=0; i<2;i++) {
			for(int j=0;j<5;j++) {
				
			add=add+a[i][j];
			
			}
			
			
			
			
		}
		for(int i=0; i<2;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(a[i][j] + "  ");
	}
			System.out.println();
		}
	
	System.out.println(+add);
		}
		

	public static void main(String[] args) {
		MatrixArrayInTwoD matrixArrayInTwoD=new MatrixArrayInTwoD();
		matrixArrayInTwoD.matrixarray();

	}

}
