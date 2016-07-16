package com.training.exception.assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionsThrow {

	public static void main(String[] args) {
		int number;
		try{
			System.out.println("Enter the number");
		Scanner reader = new Scanner(System.in);
		number = reader.nextInt(); 
		int cube= number*number*number;
		System.out.println("The cube of the entered number is "+cube);

	} catch(InputMismatchException ae){
		try{
			throw new MyCustomException("Wrong input, Call 1-800-888-8244 for Help");
		}catch(MyCustomException MCE){
			String message = MCE.getMessage();
			System.out.println (message);
		}
	}
		

	}

}
