package com.assignment.exceptionhandling;

import java.util.Scanner;

public class ThrowNumberFormatException {

	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Age: ");
			String age = sc.nextLine();
			int id = Integer.parseInt(age);
			System.out.println("Your age is: " + id);
			sc.close();
		}catch(NumberFormatException nf){
			throw new NumberFormatException("You need to enter a number");
		}
		
	}
	}
