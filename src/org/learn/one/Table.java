package org.learn.one;

//. Write a Java program that takes a number as input and prints its multiplication table up to 10.

/* change the logic
 * for(1-10){
for(j=2;j<=2;j++)
sop(j +"*" + i +"="+j*i)
}
done 
 */
public class Table {
	void t1() {
		int mul = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 2; j <=2; j++) {
				mul = j*i;
				System.out.print(j +"*" + i +"="+j*i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Table table = new Table();
		table.t1();

	}
}