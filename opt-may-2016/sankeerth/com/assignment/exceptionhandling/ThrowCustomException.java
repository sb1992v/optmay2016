package com.assignment.exceptionhandling;

import java.util.Scanner;

public class ThrowCustomException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		try{
			if(age < 21)
			{
				throw new NotAllowedToDrinkException("You Are Underaged!!"
						+ "\nAnd Could be Jailed For Drinking!!"
						+ "\nPlease leave the premises");
			}
			else{
				System.out.println("***Welcome to the Pub***"
						+ "\n Have a Great Time");
			}
		}catch(NotAllowedToDrinkException nd)
		{
			String message = nd.getMessage();
			System.out.println(message);
		}finally{
			sc.close();
		}

	}

}
