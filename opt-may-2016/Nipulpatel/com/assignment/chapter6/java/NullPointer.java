
/***************************************************************
 * @author Nipul								 date:7/8/2016 
 * project:Exception Handling.
 * Scope : Practices to a Exception handling on Null Pointer
 * exception   
 * Scope change : none
 * class : Main class
 ***************************************************************/
package com.assignment.chapter6.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.assignment.chapter7.java.StudentName;

public class NullPointer {

	private static List<String> string; 
	private static Scanner userInput1;

	public static void main(String[] args) {

		try {
			string = new ArrayList<>();

			StudentName S = new StudentName("jakkku", "jakkulaakhilesh@gmail.com");
			StudentName S1 = new StudentName("Abhilash", "madhavaram.tinku@gmail.com");
			//StudentName is class name which is located in other package 
			HashMap<String, StudentName> map = new HashMap<String, StudentName>();
			
			map.put("Jakkku", S);
			map.put("Abhilash", S1);
			

			String name = "";
			userInput1 = new Scanner(System.in);
			System.out.println("Enter a persons name");
			name = userInput1.next();

			StudentName student = (StudentName) map.get(name);
			System.out.println(student.getFirstName() + " " + student.getEmail());
		} 
		
		catch (java.lang.NullPointerException npe) {

			System.out.println("NullPointerException is handled Hint: First latter capital");

		}
		
	}

}
