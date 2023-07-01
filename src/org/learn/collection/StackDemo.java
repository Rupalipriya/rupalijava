package org.learn.collection;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		stack.push("ttt");
		stack.push("www");
		stack.push("uuuu");
		stack.push("eee");
		System.out.println(stack);
	//	stack.pop();
	//	System.out.println(stack);
	//	stack.pop();
	//	System.out.println(stack);
		System.out.println(stack.search("ttt"));//it gives offset
		System.out.println(stack.search("zzzz"));
	}

}
