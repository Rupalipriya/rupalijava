package org.learn.multithreading;

public class ThreadClassDemo extends Thread{
	
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("Hello Thread of run method");
		}
	}
	
	@Override
	public synchronized void start() {
		System.out.println("Start method Expalictly");
	}

}
