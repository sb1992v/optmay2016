package com.two95.chapter8;

public class PrinterThread extends Thread{
	Printer p;
	String data;
	public PrinterThread(Printer p,String data){
		this.p=p;
		this.data=data;
	}
	public void run(){
		p.print(data);
	}

}
