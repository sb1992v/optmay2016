package com.two95.assignment7;
import java.util.*;
public class HeightComparator implements Comparator {
	public int compare(Object o1,Object o2){
		Student s1=(Student) o1;
		Student s2=(Student) o2;
		int index=s1.getHeight().compareTo(s2.getHeight());
		return index;
	}
}
