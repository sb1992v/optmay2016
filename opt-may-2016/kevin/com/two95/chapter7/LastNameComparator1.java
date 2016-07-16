package com.two95.chapter7;
import java.util.*;
public class LastNameComparator1 implements Comparator {
	public int compare(Object o1,Object o2){
		Customer c1=(Customer) o1;
		Customer c2=(Customer) o2;
		int index=c1.getLastName().compareTo(c2.getLastName());
		return index;
		
	}

}
