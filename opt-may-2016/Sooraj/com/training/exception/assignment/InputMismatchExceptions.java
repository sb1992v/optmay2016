package com.training.exception.assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptions {

	public static void main(String[] args) {
		double num;
		try{
			System.out.println("Enter the number");
		Scanner reader = new Scanner(System.in);
		num = reader.nextDouble(); 
		System.out.println("The double of the entered number is " +num*2);

	} catch(InputMismatchException ae){
		System.out.println(ae);
	}
		
	}

}
