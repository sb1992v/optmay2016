
/***************************************************************
 * @author Nipul								 date:7/8/2016 
 * project:Exception Handling (Assignment 8).
 * Scope : Practices to a Exception handling on Arithmetic 
 * exception   
 * Scope change : none
 * class : Main class
 ***************************************************************/


package com.assignment.chapter6.java;

import java.util.Scanner;
 
public class ArithmeticException {

	private static Scanner userInput;
	private static Scanner userInput1;

	public static void main(String[] args) {

		
		try {
		int devidend;
		int divisor;
		int quotient;
		userInput = new Scanner(System.in);
		System.out.println("Enter a devidend");
		devidend = userInput.nextInt();

		userInput1 = new Scanner(System.in);
		System.out.println("Enter a devisor");
		divisor = userInput1.nextInt();
		//
	
		
			quotient = devidend / divisor;
			System.out.println("the answer is   " + quotient);
			
			} catch (java.lang.ArithmeticException ae) {
			System.out.println("Arithmetic Exception check the divisor");
			
		}
		
		}
	}


