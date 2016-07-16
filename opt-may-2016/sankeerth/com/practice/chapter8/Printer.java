package com.practice.chapter8;

public class Printer {

	public void print(String data){
		System.out.println("Printing " + data + " started");
		
		try{
			Thread.sleep(1000);
		}catch(Exception e){			
		}
		
		System.out.println("Printing " + data + " completed");
	}
}
