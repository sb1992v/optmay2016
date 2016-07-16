package com.assignment.exceptionhandling;

public class TryArithmeticException {

	public static void main(String[] args) {

		int i = 69;
		int j = 0;
		try{
			i = i / j;
		}catch(ArithmeticException ae){
			System.out.println("The denominator cannot be 0");
		}
		finally{
			System.out.println("Your program will be terminated after this statement");
		}
	}

}
