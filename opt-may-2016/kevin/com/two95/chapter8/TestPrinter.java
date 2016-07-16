package com.two95.chapter8;

public class TestPrinter {

	public static void main(String[] args) {
		SynchronizedPrinter s=new SynchronizedPrinter();
		SynchronizedThread s1=new SynchronizedThread(s,"Document 1");
		SynchronizedThread s2=new SynchronizedThread(s,"Document 2");
		SynchronizedThread s3=new SynchronizedThread(s,"Document 3");
		SynchronizedThread s4=new SynchronizedThread(s,"Document 4");
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		

	}

}
