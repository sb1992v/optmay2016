package com.assignment.exceptionhandling;

public class TryArrayIndexOutOfBoundsException {

	public static void main(String[] args) {

		int a[] = {2, 3, 4};
		try{
			System.out.println(a[3]);
		}catch(ArrayIndexOutOfBoundsException ab){
			System.out.println("Limit yourselves to array bounds");
		}
		finally{
			System.out.println("Your program will be terminated after this statement");
		}

	}

}
