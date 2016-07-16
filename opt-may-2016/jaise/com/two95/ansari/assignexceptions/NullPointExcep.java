package com.two95.ansari.assignexceptions;

// Null pointer exception handling
public class NullPointExcep {

	public static void main(String[] args) {
		Integer i = null;// may cause null pointer exception if not changed in
							// future statements
		int a = 1;
		int b = 2;

		try {
			System.out.println(Integer.max(a, b));
			i.intValue();
			System.out.println("Just a regular text");
		} catch (NullPointerException ay) {
			ay.printStackTrace();
			System.out.println("Null pointer exception handled:\ni pointing to null");
		} finally {
			System.out.println("Finally block");
		}
	}

}
