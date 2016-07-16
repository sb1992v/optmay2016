package com.two95.chapter8;

public class ThreadStarter {

	public static void main(String[] args) {
		LessImportantThread t=new LessImportantThread("A");
		t.setPriority(5);
		t.start();
		CriticalThread t1=new CriticalThread("B");
		t1.setPriority(10);
		t1.start();
		CriticalThread t2=new CriticalThread("C");
		t2.setPriority(10);
		t2.start();
		CriticalThread t3=new CriticalThread("D");
		t3.setPriority(10);
		t3.start();
		System.out.println("Main thread completed");

	}

}
