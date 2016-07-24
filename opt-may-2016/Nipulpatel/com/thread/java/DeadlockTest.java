
/***************************************************************
 * @author Nipul								 date:7/8/2016 
 * project: Threads 
 * Scope : Create a deadlock example using threads.
 *  Scope change : none
 * class : DeadlockTest (main class)
 ***************************************************************/
package com.thread.java;

class DeadlockTest extends Thread
 
{
	Deadlock1 a = new Deadlock1();
	Deadlock2 b = new Deadlock2();

	public void m1() {
		this.start();
		a.d1(b);
	}

	public void run() {
		b.d2(a);
	}

	public static void main(String[] args) {

		DeadlockTest d = new DeadlockTest();
		d.m1();

	}

}
