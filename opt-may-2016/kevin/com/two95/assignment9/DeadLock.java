package com.two95.assignment9;

public class DeadLock {
	String str1="Kevin";
	String str2="Bessel";
	Thread t1=new Thread("Thread 1"){
		public void run(){
			while(true){
				synchronized(str1){
					synchronized(str2){
						System.out.println(str1+" "+str2);
					}
				}
			}
		}
	};
	Thread t2=new Thread("Thread 2"){
		public void run(){
			while(true){
				synchronized(str2){
					synchronized(str1){
						System.out.println(str2+" "+str1);
					}
				}
			}
		}
	};

	public static void main(String[] args) {
		DeadLock d=new DeadLock();
		d.t1.start();
		d.t2.start();
	}

}
