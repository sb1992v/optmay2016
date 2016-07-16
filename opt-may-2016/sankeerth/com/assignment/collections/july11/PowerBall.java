package com.assignment.collections.july11;

import java.util.*;

public class PowerBall {

	public static void main(String[] args) {

		System.out.println("Numbers of the powerball are: ");
		Random rand = new Random();
		for (int i = 0; i <= 4; i++) {
			// Using HashSet gives only unique numbers
			Set<Integer> set = new HashSet<Integer>();
			// In Power ball white numbers range from 1 to 69
			int numbers = rand.nextInt(69) + 1;
			set.add(numbers);

			Iterator<Integer> itr = set.iterator();

			while (itr.hasNext()) {

				int powerball = (int) itr.next();
				System.out.println(powerball);

			}

		}
		// The final power ball number ranges from 1 to 26
		int powerballNumber = rand.nextInt(26) + 1;
		System.out.println("Powerball Number is: " + powerballNumber);
	}
}
