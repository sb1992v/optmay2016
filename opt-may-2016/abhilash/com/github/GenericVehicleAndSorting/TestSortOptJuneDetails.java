package com.github.GenericVehicleAndSorting;

import java.util.Iterator;

import java.util.TreeSet;

public class TestSortOptJuneDetails {

	public static void main(String[] args) {
 
		TreeSet set = new TreeSet(new AgeComparator());
		set.add(new SortOptJunneBatch("abhilash", "madhavaram", 25, 181));
		set.add(new SortOptJunneBatch("sankeerth", "pinninti", 24, 180));
		set.add(new SortOptJunneBatch("krishna", "kalyanam", 23, 175));
		set.add(new SortOptJunneBatch("jaise", "John", 22, 178));
		
		
		
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			SortOptJunneBatch sort = (SortOptJunneBatch) itr.next();
		System.out.println(sort.getFirstName() + " " +sort.getLastName() + " " +sort.getAge() + " "	+ sort.getHeight() );
		}
		
		
		
	}

}
