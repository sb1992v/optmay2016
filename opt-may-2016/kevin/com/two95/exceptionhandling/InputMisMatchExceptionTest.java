package com.two95.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMisMatchExceptionTest {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter an integer");
		try{
			int num=scan.nextInt();
			System.out.println("The square of "+num+" is "+num*num);
		}
		catch(InputMismatchException ex){
			System.out.println("You entered bad data");
			System.out.println("Run it again");
		}
		System.out.println("Bye");

	}

}
