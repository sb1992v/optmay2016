package com.two95.chapter8;

public class ThreadTest {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.isAlive());
		System.out.println(t.getPriority());

	}

}
