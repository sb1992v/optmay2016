package com.github.GenericVehicleAndSorting;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<SortOptJunneBatch> {

	@Override
	public int compare(SortOptJunneBatch s1, SortOptJunneBatch s2) {
		 int index = s1.getFirstName().compareTo(s2.getFirstName());
		 return index;
 	}
	

}
