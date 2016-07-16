package com.chapter7.assignment7_2;

import java.util.Comparator;

public class HeightComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2)
	{
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		int idx = s1.getHeight().compareTo(s2.getHeight());
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
