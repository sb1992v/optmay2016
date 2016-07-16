package com.assignment.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryInputMismatchException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		try{
			int i = sc.nextInt();
			System.out.println(i);
		}catch(InputMismatchException ie){
			System.out.println("Input can only be an int value");
		}
		finally{
			System.out.println("Your program will be terminated after this statement");
			sc.close();
		}
	}

}
