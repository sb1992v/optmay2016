package com.training.exception.assignment;

public class NullPointerExceptions {

	public static void party() {
		String nullString = null;
        nullString.endsWith("test");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the main method");
		try {
			
			party();
			System.out.println("The party will start in few minutes");
		} catch (NullPointerException ae) {
			System.out.println("The exception is " + ae);
		} finally {
			System.out.println("Printing from finally block");
		}
	}

}
