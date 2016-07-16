package com.assignment.collections.july11;

import java.util.*;

public class EmployeeSortTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Wolverine", 137));
		list.add(new Employee("Ironman", 33));
		list.add(new Employee("Batman", 33));
		list.add(new Employee("Superman", 33));
		list.add(new Employee("Flash", 25));
		list.add(new Employee("Wonderwoman", 5000));
		
		Collections.sort(list);
		System.out.println("Sorted employees according to name");
		//Sorting employees according to name using Comparable interface
		for(Employee i: list){
			System.out.println(i);
		}
		
		Collections.sort(list, new AgeComparator());
		System.out.println("\nSorted employess according to age and name");
		//Sorting employees according to age using Comparator interface
		for(Employee i : list){
			System.out.println(i);
		}
	}

}
