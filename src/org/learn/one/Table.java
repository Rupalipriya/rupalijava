package org.learn.one;

public class Table {
	void t1() {
	 int mul = 1;
    for(int i=1;i<=10;i++)
    {
        for(int j=2;j<=10;j++)
        {
            mul = i*j;
            System.out.print(" table "+mul);
        }
        System.out.println();
    }
}
	public static void main(String[] args) {
		
		Table table =new Table();
		table.t1();

}
}