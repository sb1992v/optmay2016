package com.two95.chapter8;

public class MyThreadTest {

	public static void main(String[] args) {
		MyThread t=new MyThread();
		Thread th=new Thread(t);
		th.start();
		System.out.println("Main thread about to terminate");
		System.out.println("Main thread terminated");

	}

}
