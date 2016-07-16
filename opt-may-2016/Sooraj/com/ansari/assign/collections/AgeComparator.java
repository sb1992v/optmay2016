package com.ansari.assign.collections;
import java.util.*;
public class AgeComparator implements Comparator<Employee>{

public int compare(Employee a1, Employee a2){
	
	int index= a1.getAge(). compareTo(a2.getAge());
	return index;
	
}
}
