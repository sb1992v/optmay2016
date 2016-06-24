package com.training.krishna;

public class Armstrong {

	public static void main(String[] args) {
		int i = 2;
		int a = i%10;
		int z = (i-a)/10;
		int b = z%10;
		int y= (z-b)/10;
		if (i == (a*a*a)+(b*b*b)+(y*y*y)) {
			System.out.println("this is armstrong number");
		} else {
			System.out.println("this not armstrong number");

		}

	}

}
