package com.chapter7.assignment7_2;

import java.util.Comparator;

public class FirstNameComparator implements Comparator{
	
	public int compare(Object o1, Object o2)
	{
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		int idx = s1.getFirstName().compareTo(s2.getFirstName());
		if (idx == 0)
		{
			return 1;
		}
		else
		{	
			return idx;
		}
	}
}
