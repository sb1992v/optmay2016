package com.training.krishna;

import java.util.Comparator;

public class LastName implements Comparator <Students>{
	public int compare (Students o1,Students o2){
		int index = o1.getLastName().compareTo(o2.getLastName());
		return index;
		
	}
}
