package com.two95.ansari.assignexceptions;

public class ArithmeticExcept {

	public static void main(String[] args) {
		int a = 1;
		try {
			a = a / 0;
			System.out.println("a " + a);
		} catch (java.lang.ArithmeticException ae) {
			System.out.println("Arithmetic exception occured");
			ae.printStackTrace();
		}

		finally {
			System.out.println("outside try and catch block");
			System.out.println("finally block");
		}
	}

}
