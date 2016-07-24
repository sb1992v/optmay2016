/***************************************************************
 * @author Nipul								 date:7/8/2016 
 * project:Exception Handling.
 * Scope : Practices to a Exception handling on Input Mismatch
 * exception   
 * Scope change : none
 * class : Main class
 ***************************************************************/

package com.assignment.chapter6.java;

import java.util.Scanner;

public class InputMismatch {

	@SuppressWarnings("unused")
	private static Scanner scanner;
	private static Scanner userInput1;

	@SuppressWarnings("resource") 
	public static void main(String[] args) throws MyCustomException {

		try {

			int devidend = 0;
			int quotient = 0;
			int divisor = 0;

			Scanner userInput;
			scanner = userInput = new Scanner(System.in);
			System.out.println("Enter a Devidend");
			devidend = userInput.nextInt();

			userInput1 = new Scanner(System.in);
			System.out.println("Enter a Devisor");
			divisor = userInput1.nextInt();
			quotient = devidend / divisor;
			System.out.println("The answer is   " + quotient);

			if (quotient < 0 || divisor < 0 || devidend < 0) {
				throw new MyCustomException("Input is invalid");
			} else {

			}

		} catch (java.util.InputMismatchException IME) {
			System.out.println("Exception Input Mismatch is handled ");
		} catch (java.lang.ArithmeticException ae) {
			System.out.println("Arithmetic Exception check the divisor");

		}

	}
}
