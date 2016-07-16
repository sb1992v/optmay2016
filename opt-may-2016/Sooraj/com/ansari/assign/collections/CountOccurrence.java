package com.ansari.assign.collections;

import java.util.*;

public class CountOccurrence {

	public static void main(String[] args) {
		int total = 0;
		Integer array[] = { 31, 31, 32, 32, 33, 33, 33, 33 };
		List<Integer> list = Arrays.asList(array);
		Set<Integer> set = new TreeSet(list);
		for (Integer at : set) {
			for (Integer no : list) {
				if (no == at) {
					total++;
				}
			}

			System.out.println("The number of times "+at+" occurs are/is " + total);
			total = 0;
		}
	}

}
