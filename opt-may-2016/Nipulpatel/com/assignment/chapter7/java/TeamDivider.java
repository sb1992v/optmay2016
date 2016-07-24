/***************************************************************
 * @author Nipul								 date:7/11/2016 
 * project:Collection (Assignment 8)
 * Scope : Create a program using Collections to divide the class
 *  into 2 teams in a random fashion
 * Scope change : none
 * class : Main class
 * Test :Every time when the code is runs then it shows 
 *       Deferment to teams.
 ***************************************************************/

package com.assignment.chapter7.java;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TeamDivider {

	public static void main(String[] args) {

		List<String> random = new ArrayList<>();

		random.add("Sharanya");
		random.add("Nipul");
		random.add("Sankerth");
		random.add("bhavin");
		random.add("Abhilash");
		random.add("Roni");
		random.add("Dayana");
		random.add("Sooraj");
		random.add("Anusha");
		random.add("Kalyalam");
		random.add("Jais");
		random.add("Vanktash");

		Collections.shuffle(random);
		int count2 = 0;

		int[] anArray = new int[12];
		
		int plus = 0;
		for (int count = 0; count < 6; count++) {

			String out = random.get(count2);

			System.out.println(" team 1 " + out);
			count2++;
		}

		for (int count = 0; count < 6; count++) {

			String out2 = random.get(count2);

			System.out.println("team 2 is " + out2);
			count2++;
		}

	}
}
