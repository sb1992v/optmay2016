package com.practice.chapter8;

public class CriticalThread extends Thread{

	public CriticalThread(String name){
		super(name);
	}
	
	public void run(){
		System.out.println(getName() + " Running");
		System.out.println(getName() + " yielding");
		
	}
}
