//Program to add 2 numbers without using + operator
package com.two95.assignment2;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		int a,b,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		sum=sum-(-a-b);
		System.out.println("Sum="+sum);
	   s.close();
		

	}

}
