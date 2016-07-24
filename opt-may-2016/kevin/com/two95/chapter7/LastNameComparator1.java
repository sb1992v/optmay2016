package com.two95.chapter7;
import java.util.*;
public class LastNameComparator1 implements Comparator {
	public int compare(Object o1,Object o2){
		CustomerDetails c1=(CustomerDetails) o1;
		CustomerDetails c2=(CustomerDetails) o2;
		int index=c1.getLastName().compareTo(c2.getLastName());
		return index;
		
	}

}
