package org.practice.java;
/*
 * WAP in java to calculate average of elements present in array.
 */
public class CalculateAvarageNumOfArray {
void calculateavarage() {
	int sum=0;
	int average=0;
	int a[]= {1,2,3,4,5};
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
		average=sum/a.length;
		
	}
	System.out.println("average of array " +average);
	
}
	public static void main(String[] args) {
		CalculateAvarageNumOfArray calculateAvarageNumOfArray=new CalculateAvarageNumOfArray();
		calculateAvarageNumOfArray.calculateavarage();

	}

}
