//Program to check whether a given number is Armstrong or not
package com.two95.assignment2;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int sum,n,n1,r;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		 n=s.nextInt();
		 n1=n;
		  sum=0;
		while(n1>0){
		    r=n1%10;
			sum=sum+(r*r*r);
			n1=n1/10;
		}
		if(n==sum){
			System.out.println("The number is Armstrong");
		}
		else{
			System.out.println("The number is not Armstrong");
		}
          s.close();
	}

}
