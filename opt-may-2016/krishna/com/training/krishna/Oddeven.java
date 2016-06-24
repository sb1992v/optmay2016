package com.training.krishna;

import java.util.Scanner;

public class Oddeven {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = ss.nextInt();
		
		int b= 2;
		double c = a* Math.pow(b, -1);
		int d = (int) (a* Math.pow(b, -1));
		double e=(double) d;
		if (c-e !=0) {
			System.out.println("number is odd");
		} else {
			System.out.println("number is even");

		}
		ss.close();
	}

}
