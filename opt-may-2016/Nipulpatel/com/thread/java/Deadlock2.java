/***************************************************************
 * @author Nipul								 date:7/8/2016 
 * project: Threads 
 * Scope : Create a deadlock example using threads.
 *  Scope change : none
 * class : Deadlock2
 ***************************************************************/



package com.thread.java;

public class Deadlock2 {

	public synchronized void d2(Deadlock1 a) {

		System.out.println("Thread 2 start execution of d2 method");
     
		try {

			Thread.sleep(6000);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread 2 trying to call Deadlock1 a.last");
		a.last();
	}

	public synchronized void last() {

		System.out.println("Inside  Deadlock2 this is  last method");

	}

}
