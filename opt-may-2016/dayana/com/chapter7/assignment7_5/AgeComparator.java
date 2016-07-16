package com.chapter7.assignment7_5;

import java.util.Comparator;

public class AgeComparator implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		Employee emp = (Employee) arg0;
		Employee emp1 = (Employee) arg1;
		int id = emp.getAge().compareTo(emp1.getAge());
		return id;
	}

}
