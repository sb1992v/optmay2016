package com.practice.chapter8;

public class RunnableTest {

	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		Thread th = new Thread(t1);
		th.setPriority(Thread.MAX_PRIORITY);
		
		th.start();
		
		System.out.println("Main thread about to terminate");
		System.out.println("Main thread terminated");

	}

}
