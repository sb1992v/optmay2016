package com.training.exception.assignment;

import java.util.Scanner;

public class NumberFormatExceptions {

	public static void main(String[] args) {
		try {
			Scanner inp = new Scanner(System.in);
			System.out.println("Enter the line");
			String num = inp.nextLine();
			int i = Integer.parseInt(num);
			System.out.println("The converted value is " + i);
		} catch (NumberFormatException nfe) {
			System.out.println("The exception is " + nfe);
		} finally {
			System.out.println("executing from finally block");
		}

	}

}
