package com.chapter7.assignment7_2;

import java.util.Comparator;

public class LastNameComparator implements Comparator {
	public int compare(Object o1, Object o2)
	{
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		int id = s1.getLastName().compareTo(s2.getLastName());
		return id;
	}

}
