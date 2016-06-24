package com.training.krishna;

import java.util.Scanner;

public class Mult {
	public static void main(String[] args){
		Scanner ss = new Scanner (System.in);
		System.out.println("Enter numerator:");
		double a = ss.nextDouble();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter denominator:");
		double b = sc.nextDouble();
		double c = a* Math.pow(b, -1);
		System.out.println(a+" "+"divided by "+b+" " +"="+" "+ c);
		
	}
	
}
