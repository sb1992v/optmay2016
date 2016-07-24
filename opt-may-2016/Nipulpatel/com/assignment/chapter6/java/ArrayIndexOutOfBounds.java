
/***************************************************************
 * @author Nipul								 date:7/8/2016 
 * project:Exception Handling (Assignment 8).
 * Scope : Practices to a Exception handling on Array out of bound 
 * Exception
 * Scope change : none
 * class : Main class 
 ***************************************************************/
package com.assignment.chapter6.java;

import java.util.Scanner;

public class ArrayIndexOutOfBounds { 

	private static Scanner userInput;

	public static void main(String[] args) {

		try {
			String Str[];

			Str = new String[5];
			Str[0] = "Nipul";
			Str[0] = "Sankerth";
			Str[2] = "Sankerth";
			Str[3] = "Bhavin";
			Str[4] = "Sooraj";

			userInput = new Scanner(System.in);
			System.out.println("Enter a number of person");
			int number = userInput.nextInt();

			System.out.println(Str[number]);

		} catch (java.lang.ArrayIndexOutOfBoundsException AIOB) {

			System.out.println(" Array Index Out Of Bounds Exception is handled");

		} catch (java.util.InputMismatchException IME1) {
			System.out.println("Exception Input Mismatch is handled ");

		}

	}
}
