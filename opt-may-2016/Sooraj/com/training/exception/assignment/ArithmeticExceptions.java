package com.training.exception.assignment;

public class ArithmeticExceptions {
	public static void main(String[] args) {
		try {
			int i = 10;

			int j = 0;
			int ans = i / j;
			System.out.println("The answer is " + ans);
		} catch (ArithmeticException ae) {
			System.out.println("The exception is" + ae);
		}
		finally{
			System.out.println("This is in finally block and will always be executed");
		}

	}

}
