/***************************************************************
 * @author Nipul								 date:7/8/2016 
 * project: Threads 
 * Scope : Create a deadlock example using threads.
 *  Scope change : none
 * class : Deadlock1
 ***************************************************************/

package com.thread.java;

public class Deadlock1 {

	public synchronized void d1(Deadlock2 b) {

		System.out.println("Thread 1 start execution of d1 method");
 
		try {

			Thread.sleep(6000);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread 1 trying to call Deadlock2 b.last");
		b.last();
	}

	public synchronized void last() {

		System.out.println("Inside Deadlock1 this is last method");

	}

}
