package com.chapter7.assignment7_4;

public class Deadlock {
	    /**
	     * @Gowtham Chitimi Reddy IIT(BHU);
	     */
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        final Object ob1 = new Object();
	        final Object ob2 = new Object();
	        Thread t1 = new Thread(){
	            public void run(){
	                synchronized(ob1){
	                    try{
	                        Thread.sleep(100);
	                    }
	                    catch(InterruptedException e){
	                        System.out.println("Error catched");
	                    }
	                    synchronized(ob2){

	                    }
	                }

	            }
	        };
	        Thread t2 = new Thread(){
	            public void run(){
	                synchronized(ob2){
	                    try{
	                        Thread.sleep(100);
	                    }
	                    catch(InterruptedException e){
	                        System.out.println("Error catched");
	                    }
	                    synchronized(ob1){                      
	                    }
	                }               
	            }
	        };
	        t1.start();
	        t2.start();
	    }

}
