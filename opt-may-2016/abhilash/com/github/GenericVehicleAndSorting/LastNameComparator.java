package com.github.GenericVehicleAndSorting;

import java.util.Comparator;

public class LastNameComparator implements Comparator<SortOptJunneBatch> {

	@Override
	public int compare(SortOptJunneBatch arg0, SortOptJunneBatch arg1) {
		int index = arg0.getLastName().compareTo(arg1.getLastName());
		 return index;
	}

}
