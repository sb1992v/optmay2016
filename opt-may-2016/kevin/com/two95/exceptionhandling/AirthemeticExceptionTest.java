package com.two95.exceptionhandling;

public class AirthemeticExceptionTest {
	public static void main(String[] args) {
		try{
			int i=10;
			int k=i/0;
			System.out.println(k);
			}
		catch(ArithmeticException ae){
			System.out.println("Airthmetic Exception handled");
		}
		System.out.println("DONE");
	}
}



