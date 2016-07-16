package com.assignment.collections.july11;

import java.util.*;

public class ArrayCount {

	public static void main(String[] args) {
		Integer num[] = { 33, 31, 32, 33, 33, 31, 33, 32 };
		List<Integer> list = Arrays.asList(num);
		//Passes array into a list
		Set<Integer> set = new TreeSet<Integer>(list);
		//TreeSet automatically sorts the set

		for (Integer i : set) {
			System.out.println(i + " - " + Collections.frequency(list, i) + " times");
		}
	}

}
