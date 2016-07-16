package com.two95.ansari.assigncollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FirstProb {

	public static void main(String[] args) {
		int count = 0;

		Integer array[] = { 33, 31, 32, 33, 33, 31, 33, 32 };
		List<Integer> list = Arrays.asList(array);
		Set<Integer> set = new TreeSet<>(list);
		for (Integer i : set) {
			for (Integer in : list) {
				if (i == in) {
					count++;
				}

			}
			System.out.println(i + " - " + count + " times");
			count = 0;

		}

	}
}
