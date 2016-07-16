package com.two95.chapter8;

public class TestThread {

	public static void main(String[] args) {
		AnotherThread t1=new AnotherThread();
		t1.start();
		System.out.println("Main thread completed");

	}

}
