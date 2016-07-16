package com.two95.chapter8;

public class SynchronizedThread extends Thread {

	SynchronizedPrinter s;
	String data;
	public SynchronizedThread(SynchronizedPrinter s,String data){
		this.s=s;
		this.data=data;
	}
	public void run(){
		s.print(data);
	}
}
