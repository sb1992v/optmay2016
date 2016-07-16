package com.chapter2.assignment2;

import java.util.Scanner;

public class Assgn2 {

	public static void main(String[] args) {
		findEvenOdd();
		armStrong();
		swapWithoutThirdVariable();
		addition();
		multiplication();
	}

	static void findEvenOdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter vale of m");
		int m = sc.nextInt();
		for (int i = 0; m >= 0; i++) {
			m = m - 2;
		}
		m = m + 2;
		if (m == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}
		sc.nextLine();
	}

	static void armStrong() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter vale of m");
		int n = sc1.nextInt();
		int num = n;
		int numDigits = 0, sum = 0, rem;
		while (num != 0) {
			numDigits++;
			num = num / 10;
		}
		num = n;
		System.out.println("Number of digits are" + numDigits);
		while (numDigits > 0) {
			rem = num % 10;
			num = num / 10;
			sum = (int) (sum + Math.pow(rem, 3));
			numDigits--;
		}
		if (sum == n)
			System.out.println("Armstrong");
		else
			System.out.println("Not an armStrong");
	}

	static void swapWithoutThirdVariable() {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter first number");
		int n = sc2.nextInt();
		System.out.println("Enter second number");
		int m = sc2.nextInt();
		n = n + m;
		m = n - m;
		n = n - m;
		System.out.println("first number is :" + n + "Second number is :" + m);
	}

	static void addition() {
		int X[] = new int[100];
		int Y[] = new int[100];
		int Z[] = new int[100];
		int large;
		int a, i, carry = 0, p, q;
		int j;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter  a number");
		a = s.nextInt();
		p = a;
		for (i = 0; a > 0; i++) {
			X[i] = a % 2;
			a = a / 2;
		}
		System.out.println("Enter second number");
		int b = s.nextInt();
		q = b;
		for (j = 0; b > 0; j++) {
			Y[j] = b % 2;
			b = b / 2;
		}
		if (p > q)
			large = i;
		else
			large = j;
		for (int k = 0; k <= large - 1; k++) {
			if ((X[k] == 1) & (Y[k] == 1)) {
				Z[k] = X[k] ^ Y[k];
				Z[k] = Z[k] ^ carry;
				carry = 1;
			} else if ((X[k] == 0) & (Y[k] == 0)) {
				Z[k] = X[k] ^ Y[k];
				Z[k] = Z[k] ^ carry;
				carry = 0;
			} else if ((X[k] == 1) & (Y[k] == 0)) {
				Z[k] = X[k] ^ Y[k];
				if ((Z[k] == 1) & (carry == 1)) {
					Z[k] = Z[k] ^ carry;
					carry = 1;
				} else if (carry == 0) {
					Z[k] = Z[k] ^ carry;
					carry = 0;
				}
			} else {
				Z[k] = X[k] ^ Y[k];
				if ((Z[k] == 1) & (carry == 1)) {
					Z[k] = Z[k] ^ carry;
					carry = 1;
				} else if (carry == 0) {
					Z[k] = Z[k] ^ carry;
					carry = 0;
				}
			}
		}
		// System.out.println("Carry is"+ carry);
		if (carry == 1) {
			Z[large] = carry;
		}

		for (i = large; i >= 0; i--) {
			System.out.print(Z[i]);
		}
		int num = 0;
		System.out.println('\n');
		for (int r = 0; r <= large; r++) {
			num = (int) (num + Z[r] * (Math.pow(2, r)));
		}
		System.out.println("Result :" + num);
		s.close();

	}

	static void multiplication() {

	}

}
