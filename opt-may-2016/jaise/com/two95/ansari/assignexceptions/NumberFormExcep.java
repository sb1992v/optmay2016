package com.two95.ansari.assignexceptions;

// Number format exception class
public class NumberFormExcep {

	public static void main(String[] args) {
		String s = "shfj12";
		try {
			System.out.println("inside try");
			int i = Integer.parseInt(s);// harmful statement
			System.out.println("after the harmful statement");

		} catch (NumberFormatException aa) {
			aa.printStackTrace();
		} finally {
			System.out.println("Finally block");
		}
	}

}
