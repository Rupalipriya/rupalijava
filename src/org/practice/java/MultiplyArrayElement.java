package org.practice.java;
/*
 * java program to multiply the element of array
 */
public class MultiplyArrayElement {
void multiplyarray() {
	int a[]= {2,3,2,2,2};
	int mul=1;
	for(int i =0;i<a.length;i++) {
		mul=mul*a[i];
	}
	System.out.println("multiply of array element " +mul);
}
	public static void main(String[] args) {
		MultiplyArrayElement multiplyArrayElement=new MultiplyArrayElement();
		multiplyArrayElement.multiplyarray();

	}

}
