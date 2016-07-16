package com.training.exception.assignment;

import java.util.Scanner;

public class NumberFormatExceptionThrow {

	public static void main(String[] args) {
		try {
			Scanner inp = new Scanner(System.in);
			System.out.println("Enter the line");
			String num = inp.nextLine();
			int i = Integer.parseInt(num);
			
			System.out.println("The converted value is " + i);
			
		} catch (NumberFormatException nfe) {
			try {
				throw new NumberFormatException("Call 1-800-888-8244 for Help");
			} catch (NumberFormatException e) {
				String message = e.getMessage();
				System.out.println (message);
				
				
			}
		} 
		}

	}


