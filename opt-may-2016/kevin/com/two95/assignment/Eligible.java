package com.two95.assignment;
import java.util.Scanner;
public class Eligible {
	public static void main(String args[]){
		int age;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the age ");
		age=in.nextInt();
		if(age>=18){
		System.out.println("Congratulation! Eligible to vote ");	
		}
		else{
			System.out.println("Sorry! Not eligible to vote");
		}
		in.close();
	}

}
