package com.anusha.training;
import java.lang.Integer;
public class WrapperDemo {

	public static void main(String[] args) {
	 int i =10;
	 Integer ii = new Integer(i);
	 add(ii);

	}
   static void add(Integer object){
	   int Val = object.intValue() + 5;
	   System.out.println(Val);
	   
	   
	   
	   
	   
	
}
}
