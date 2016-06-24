//Program to print the number of days for given month
package com.two95.assignment2;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the month");
		String month=s.next();
		switch(month){
		case "January":
		case "March":
		case "May":
		case "July":
		case "August":
		case "October":
		case "December":
			System.out.println("Number of days is 31");
			break;
		case "February":
			System.out.println("Number of days is 28");
			break;
		case "April":
		case "June":
		case "September":
		case "November":
			System.out.println("Number of days is 30");
			break;
			default: 
		    System.out.println("");
			break;
		}
         s.close(); 
	}

}
