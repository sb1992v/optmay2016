package com.venkat.chapter7;

import java.util.Comparator;

public class IdComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		int index = 0;
		if (e1.getId() > e2.getId()) {
			index = -1;
		} else if (e1.getId() < e2.getId()) {
			index = 1;
		} else if (e1.getId() == e2.getId()) {
			index = 0;
		}
		return index;
	}

}
