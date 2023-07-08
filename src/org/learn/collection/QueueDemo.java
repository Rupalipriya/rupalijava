package org.learn.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<>();
		queue.offer("jjjj");
		queue.offer("pppp");
		queue.offer("kkkkk");
		queue.offer("mmmm");
		System.out.println(queue);
		//queue.remove();
		//System.out.println(queue);
		//queue.remove("kkkkk");
		//System.out.println(queue);
		System.out.println(queue.element());//to find the first element
		System.out.println(queue.poll());
		
	}

}
