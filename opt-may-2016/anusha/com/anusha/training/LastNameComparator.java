package com.anusha.training;

import java.util.Comparator;

public class LastNameComparator implements Comparator<OptJune> {

	@Override
	public int compare(OptJune o1, OptJune o2) {
		int index=o1.getLastName().compareTo(o2.getLastName());
		return index;
		
	}

}
