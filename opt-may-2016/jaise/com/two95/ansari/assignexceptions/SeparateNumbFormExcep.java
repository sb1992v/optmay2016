package com.two95.ansari.assignexceptions;

public class SeparateNumbFormExcep {

	

	// Number format exception class
	
		public static void main(String[] args) {
			String s = "shfj12";
			try {
				System.out.println("inside try");
				int i = Integer.parseInt(s);
				throw new NumberFormatException();// harmful statement

			} catch (NumberFormatException aa) {
				String msg = aa.getMessage();
				System.out.println("msg : "+msg);
				
			} finally {
				System.out.println("Finally block");
			}
		}

	


	}


