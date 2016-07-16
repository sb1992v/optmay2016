package com.ansari.assign.collections;

import java.util.*;

public class NameComparator implements Comparator<Employee> {
	public int compare(Employee N1, Employee N2){
		
		return  N1.getName().compareTo(N2.getName());
		
	}

}
