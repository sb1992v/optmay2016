package com.two95.ansari.assignexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

// Input Mismatch Exception
public class InputMismatchExcep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the number");
			int i = sc.nextInt();
			InputMismatchException aa = new InputMismatchException("Expects integer type data");
		} catch (InputMismatchException aa) {
			aa.printStackTrace();
			System.out.println("Stack trace printed...pls enter integer value next time");
		} finally {
			System.out.println("finally block");
		}

	}

}
