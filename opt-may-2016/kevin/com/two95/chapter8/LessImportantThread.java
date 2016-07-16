package com.two95.chapter8;

public class LessImportantThread extends Thread {
	public LessImportantThread(String name){
		super(name);
	}
	public void run(){
		System.out.println(getName()+" running");
		System.out.println(getName()+" yielded");
		yield();
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			
		}
		System.out.println(getName()+" running again");
	}

}
