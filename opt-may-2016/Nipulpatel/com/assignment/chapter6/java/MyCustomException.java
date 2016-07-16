
/***************************************************************
 * @author Nipul								 date:7/8/2016 
 * project:Exception Handling (Assignment 8).
 * Scope : Create a customize Exception
 * Scope change : none
 * class : Main class
 ***************************************************************/


package com.assignment.chapter6.java;

@SuppressWarnings("serial")
public class MyCustomException extends Exception {
		public MyCustomException(String message) {
		// Pass the message to the parent class constructor
		super(message);
		System.out.println("Costomized Excption");
		}
	}
