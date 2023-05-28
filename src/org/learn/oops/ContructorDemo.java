package org.learn.oops;

public class ContructorDemo {
	
	String name;
	int roll;
	
	public ContructorDemo() {
System.out.println("No argument contr");
	}
	
	public ContructorDemo(String name, int roll) {
		this.name = name;
		this.roll = roll;
		System.out.println("Name: "+name +" Roll:"+roll);
	}



	public static void main(String[] args) {
		ContructorDemo contructorDemo=new ContructorDemo();
		ContructorDemo contructorDemo2=new ContructorDemo("Ram", 101);

	}

}
