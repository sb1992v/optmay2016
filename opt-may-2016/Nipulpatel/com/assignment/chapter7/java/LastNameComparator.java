
/***************************************************************
 * @author Nipul								 date:7/8/2016 
 * project:Collection (Assignment 8)
 * Scope :Sort and print the students in opt-june batch by last name
 * age, first name and height
 * Scope change : none
 * class : Comparator
 ***************************************************************/

package com.assignment.chapter7.java;

import java.util.Comparator; 

public class LastNameComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		OptStudent c1 = (OptStudent) o1;
		OptStudent c2 = (OptStudent) o2;
		int index = c1.getLastName().compareTo(c2.getLastName());
		return index;
	}
		
		}
		
		
		
		
		
	
