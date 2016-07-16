package com.two95.chapter8;

public class SynchronizedBlock extends Thread {
	SynchronizedPrinter s;
	String data;
	public SynchronizedBlock(SynchronizedPrinter s,String data){
		this.s=s;
		this.data=data;
	}
	public void run(){
		synchronized(s){
			s.print(data);
		}
	}

}
