package com.assignment.chapter8;

public class DeadLockTest {

	public static Object lock1 = new Object();
	public static Object lock2 = new Object();
	
	public static void main(String[] args) {

		Thread1 t1 = new Thread1(lock1, lock2);
		Thread2 t2 = new Thread2(lock1, lock2);
		t1.start();
		t2.start();

	}

}
