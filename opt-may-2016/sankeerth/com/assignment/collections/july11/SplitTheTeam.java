package com.assignment.collections.july11;

import java.util.*;

public class SplitTheTeam {

	public static void main(String[] args) {

		Set<String> students = new HashSet<String>();
		students.add("Sankeerth");
		students.add("Nipul"); 
		students.add("Krishna"); 
		students.add("Sooraj"); 
		students.add("Jaise"); 
		students.add("Venkatesh"); 
		students.add("Abhilash"); 
		students.add("Kevin");
		students.add("Dayana");
		students.add("Sharanya"); 
		students.add("Bhavin"); 
		students.add("Anusha");
		
		//Converts HashSet into an String Array
		String[] teams = students.toArray(new String[students.size()]);
		
		System.out.println("Team A consists of :");
		for (int i = 0; i < teams.length /2; i++) {
			System.out.println(teams[i]);
		}
		
		System.out.println("\nTeam B consists of: ");
		for (int i = teams.length /2 ; i < teams.length; i++) {
			System.out.println(teams[i]);
		}
		
	}

}
