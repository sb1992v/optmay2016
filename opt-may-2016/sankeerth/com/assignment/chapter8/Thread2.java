package com.assignment.chapter8;

public class Thread2 extends Thread{
	
	private Object lock1;
	private Object lock2;
	
	public Thread2(Object lock1, Object lock2){
		this.lock1 = lock1;
		this.lock2 = lock2;
	}
	
	public void run(){
		synchronized(lock2){
			System.out.println("Thread 2 has lock 2");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
			synchronized(lock1){
				System.out.println("Thread 2 holding lock 1");
			}
		}
	}

}
