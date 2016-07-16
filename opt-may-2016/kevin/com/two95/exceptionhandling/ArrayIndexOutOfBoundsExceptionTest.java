package com.two95.exceptionhandling;

public class ArrayIndexOutOfBoundsExceptionTest {

	public static void main(String[] args) {
		
		      try{
		        int a[]=new int[10];
		        
		        a[11] = 9;
		      }
		      catch(ArrayIndexOutOfBoundsException e){
		         System.out.println ("ArrayIndexOutOfBounds");
		      }
		   }
}
		
