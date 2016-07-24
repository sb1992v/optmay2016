package com.assignment.chapter7.java;

import java.util.Comparator;
 
public class SortByAge implements Comparator<Object> {

	 
		@Override
		public int compare(Object o1, Object o2) {
			OptStudent c1 = (OptStudent) o1;
			OptStudent c2 = (OptStudent) o2;
			int index = ( c1.getAge()).compareTo(c2.getAge());
			return index;
		}
		

}
