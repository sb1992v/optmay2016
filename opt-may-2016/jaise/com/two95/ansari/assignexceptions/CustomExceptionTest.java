package com.two95.ansari.assignexceptions;

public class CustomExceptionTest {

	public static void main(String[] args) {
		int a = 1;
		try {
			if (a - 1 <= 0) {
				throw new CustomAException("Speak to jaise regarding the value of a.");

			} else {
				a = a / a - 1;
				System.out.println("result" + a);
			}
		} catch (CustomAException ae) {
			String message = ae.getMessage();
			System.out.println(message);

		}

	}

}
