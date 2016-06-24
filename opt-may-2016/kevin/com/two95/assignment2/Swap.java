//Program to swap 2 numbers without a third variable
package com.two95.assignment2;


import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=b-a;;
		b=b-a;
		a=a+b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		s.close();
	}

}
