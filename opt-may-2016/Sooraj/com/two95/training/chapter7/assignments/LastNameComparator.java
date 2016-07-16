package com.two95.training.chapter7.assignments;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		int index = e1.getLastName().compareTo(e2.getLastName());
		return index;
	}

}
