package com.github.GenericVehicleAndSorting;

import java.util.Comparator;

public class AgeComparator implements Comparator<SortOptJunneBatch> {

	@Override
	public int compare(SortOptJunneBatch arg0, SortOptJunneBatch arg1) {
		 
		if(arg0.getAge() > arg1.getAge()) {
			 			return 1;
			 		} else if(arg0.getAge() < arg1.getAge()) {
			 			return -1 ;
			 		} else {
			 		return 0;
			 		}
		
		
		
	}

}

