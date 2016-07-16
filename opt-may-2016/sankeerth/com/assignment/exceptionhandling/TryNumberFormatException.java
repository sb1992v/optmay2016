package com.assignment.exceptionhandling;

public class TryNumberFormatException {

	public static void main(String[] args) {

		try{
			int id = Integer.parseInt("king");
			System.out.println(id);
		}catch(NumberFormatException nf){
			System.out.println("String cannot be parsed to int");
		}
		finally{
			System.out.println("Your program will be terminated after this statement");
		}
	}

}
