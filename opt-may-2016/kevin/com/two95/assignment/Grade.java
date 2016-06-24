package com.two95.assignment;

import java.util.Scanner;

public class Grade {
	public static void main(String args[]){
		int mark;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your marks");
		mark=in.nextInt();
		if(mark>=0 && mark<=34){
			System.out.println("Fail");
		}
		else if(mark>=35 && mark<=49){
			System.out.println("C grade");
		}
		else if(mark>=50 && mark<=59){
			System.out.println("B grade");
		}
		else if(mark>=60 && mark<=79){
			System.out.println("A grade");
		}
		else if(mark>=80 && mark<=100){
			System.out.println("A+ grade");
		}
		else{
			System.out.println("INVALID MARK");
		}
		in.close();
	}

}
