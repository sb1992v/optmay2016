package com.two95.ansari.assigncollections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Jaise", 24));
		list.add(new Employee("Sooraj", 25));
		list.add(new Employee("Roni", 27));
		list.add(new Employee("Abhilash", 24));
		list.add(new Employee("Diana", 25));
		list.add(new Employee("Sharanya", 26));
		System.out.println("........Sorting with name.......\n");
		Collections.sort(list);
		for (Employee e : list) {
			System.out.println(e);
		}

		System.out.println("\n......Sorting with age........\n");
		Collections.sort(list, new AgeComparator());
		for (Employee e : list) {
			System.out.println(e);

		}

	}
}
