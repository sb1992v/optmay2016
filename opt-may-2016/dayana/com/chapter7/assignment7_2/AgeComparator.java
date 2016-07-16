package com.chapter7.assignment7_2;

import java.util.Comparator;

public class AgeComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2)
	{
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		int id = s1.getAge().compareTo(s2.getAge());
		if (id == 0)
		{
			return 1;
		}
		else
		{	
			return id;
		}
	}

}
