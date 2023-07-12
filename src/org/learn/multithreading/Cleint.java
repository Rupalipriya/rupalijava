package org.learn.multithreading;

public class Cleint {

	
	public static void main(String[] args) {//Main Thread
		ThreadClassDemo th=new ThreadClassDemo();
		th.start();//start a thread
	}
}
