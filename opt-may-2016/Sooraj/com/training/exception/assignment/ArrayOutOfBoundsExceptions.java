package com.training.exception.assignment;

public class ArrayOutOfBoundsExceptions {

	public static void main(String[] args) {
		try {
			int a[] = new int[3];
			a[1] = 15;
			a[2] = 22;
			a[3] = 50;
			a[4] = 42;
			for (int i = 0; i < 3; i++) {
				System.out.println("The values are" + a[i]);
			}
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("The exception handled is" + ae);
		}

	}

}
