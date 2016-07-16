package com.anusha.training;

import java.sql.Date;

public class Example2 {

	public static void main(String[] args) {
	try{
		Date d=null;
		if(d ==null){
			d.getTime(); 
		
		System.out.println(d);
		
		}
		
		}
	
		catch(NullPointerException nullPointer){
			
		
			System.out.println("null pointer exception handled");
	
		}
	}
	
}