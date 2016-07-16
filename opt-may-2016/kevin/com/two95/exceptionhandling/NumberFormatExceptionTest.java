package com.two95.exceptionhandling;

import java.util.Scanner;
public class NumberFormatExceptionTest {
	static int input;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		 System.out.println("Enter an integer number: ");

         try {
             input = Integer.parseInt(scan.next());
             System.out.println("You've entered number: " + input);
         } catch (NumberFormatException e) {
             System.out.println(e.getMessage()+" is not a valid format for an integer");
             System.out.println("This caused " + e);
         }

	}

}
