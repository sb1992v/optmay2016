package com.two95.ansari.assignexceptions;

/*Array Index out of bound exception */
public class ArrayindexOtBnd {

	public static void main(String[] args) {
		int array[] = new int[2]; // declaring integer type array which can hold
									// 2 values
		try {
			array[0] = 1;
			array[1] = 2;
			array[2] = 3; // exception causing statement
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Array index exception handled");
		} finally {
			System.out.println("Finally block");
		}

	}

}
