package com.assignment.exceptionhandling;

public class TryNullPointerException {

	public static void main(String[] args) {
		
		try{
			String s = null;
			System.out.println(s.substring(0, 5));
		}catch(NullPointerException ne){
			System.out.println("Null Pointer Exception");
		}
		finally{
			System.out.println("Your program will be terminated after this statement");
		}
	}
}
