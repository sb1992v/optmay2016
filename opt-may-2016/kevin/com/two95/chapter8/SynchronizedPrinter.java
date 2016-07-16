package com.two95.chapter8;

public class SynchronizedPrinter {
	public synchronized void print(String data){
		System.out.println("Printing "+data+" started");
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			
		}
		System.out.println("Printing "+data+" completed");
	}

}
