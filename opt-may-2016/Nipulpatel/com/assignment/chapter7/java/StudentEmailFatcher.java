/***************************************************************
 * @author Nipul								 date:7/8/2016 
 * project:Collections (Assignment 8)
 * Scope :Print the name and email address of all the students in 
 *        opt-june batch using collections, generic and for-each
 * Scope change : none
 * class : Main class
 ***************************************************************/

package com.assignment.chapter7.java;

import java.util.ArrayList; 
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.utilitiesCh7.java.Customer;

public class StudentEmailFatcher {

	public static void main(String[] args) {

		List<String> String = new ArrayList<>();

		StudentName S = new StudentName("jakkku", "jakkulaakhilesh@gmail.com");
		StudentName S1 = new StudentName("Abhilash", "madhavaram.tinku@gmail.com");
		StudentName S2 = new StudentName("Sooraj", "bu34226n@pace.edu");
		StudentName S3 = new StudentName("Sharanya", "sharanya.s215@gmail.com");
		StudentName S4 = new StudentName("Dayana", "dmallass@hawk.iit.edu ");
		StudentName S5 = new StudentName("Kalyalam", "kalyanamkrish@gmail.com ");
		StudentName S6 = new StudentName("Bhavin", "psbhavin@gmail.com");
		StudentName S7 = new StudentName("Jais", "j.jaise1@gmail.com");
		StudentName S8 = new StudentName("Nipul", "nipulguru.patel@gmail.com");
		StudentName S9 = new StudentName("Sankeerth", "sankeerth999@gmail.com");

		HashMap<String, StudentName> map = new HashMap<String, StudentName>();

		map.put("Jakkku", S);
		map.put("Abhilash", S1);
		map.put("Sooraj", S2);
		map.put("Sharanya", S3);
		map.put("Dayana", S4);
		map.put("Kalyalam", S5);
		map.put("Bhavin", S6);
		map.put("Jais", S7);
		map.put("Nipul", S8);
		map.put("Sankeerth", S9);
		// Get Smiths info

		String name = "";
		Scanner userInput1 = new Scanner(System.in);
		System.out.println("Enter a persons name");
		name = userInput1.next();
		//
		StudentName student = map.get(name);
		// Avoid use Null pointer exception
		if (student != null) {
			System.out.println(student.getFirstName() + " " + student.getEmail());
		}

		else {
			System.out.println("Name is not in database please try agian Hint: First latter capital");
		}
	}
}