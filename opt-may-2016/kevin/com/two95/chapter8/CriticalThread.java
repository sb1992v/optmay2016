package com.two95.chapter8;

public class CriticalThread extends Thread{
	public CriticalThread(String name){
		super(name);
	}
	public void run(){
		System.out.println(getName()+" running");
	}

}
