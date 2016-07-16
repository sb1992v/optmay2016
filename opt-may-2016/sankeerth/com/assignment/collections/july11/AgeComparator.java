package com.assignment.collections.july11;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class AgeComparator implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		Employee e1 = (Employee)arg0;
		Employee e2 = (Employee)arg1;
		if(e1.getAge() > e2.getAge()){
			return 1;
		}
		if(e1.getAge() < e2.getAge()){
			return -1;
		}
		else{
		return 0;
		}
	}

}
