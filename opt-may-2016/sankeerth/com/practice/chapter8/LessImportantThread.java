package com.practice.chapter8;

public class LessImportantThread extends Thread{
	
	public LessImportantThread(String name){
		super(name);
	}
	public void run(){
		System.out.println(getName() + " Running");
		System.out.println(getName() + " yielding");
		
		yield();
		
		try{
			Thread.sleep(1000);
		}catch(Exception e){
		}
		System.out.println(getName() + " Running Again");
	}

}
