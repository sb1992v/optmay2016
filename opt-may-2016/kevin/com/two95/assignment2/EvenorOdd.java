//Write a Java program to find odd or even number without using % or / operator
package com.two95.assignment2;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s.nextInt();
		while(a>=2){
			a=a-2;
		}
		if(a==0){
			System.out.println("The number is even");
		}
		else{
			System.out.println("The number is odd");
		}
		s.close();

	}

}
