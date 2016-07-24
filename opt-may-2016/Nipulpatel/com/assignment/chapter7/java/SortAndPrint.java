/***************************************************************
 * @author Nipul								 date:7/8/2016 
 * project:Generic (Assignment 8)
 * Scope :Sort and print the students in opt-june batch by last
 *  name, age, first name and height
 * Scope change : none
 * class : Main class
 ***************************************************************/

package com.assignment.chapter7.java; 

import java.util.*;

public class SortAndPrint {

	public static void main(String[] args) {
		System.out.println("_________________sort by last name_______________________");
		@SuppressWarnings("unchecked")
		TreeSet<OptStudent> set = new TreeSet<OptStudent>(new LastNameComparator());
		set.add(new OptStudent("Nipul", "Patel", "23", "5.9 feet"));
		set.add(new OptStudent("Roni", "Jackson", "30", "5.8 feet"));
		set.add(new OptStudent("Abhilash", "Madhvram", "23", "5.9 feet"));

		Iterator<OptStudent> itr = set.iterator();
		while (itr.hasNext()) {
			OptStudent student = itr.next();
			System.out.println(student.getLastName() + " " + student.getFirstName() + " " + student.getAge() + "   "
					+ student.getHeight());
		}{
			
			System.out.println("_________________sort by age_______________________");
			@SuppressWarnings("unchecked")
			TreeSet<OptStudent> set1 = new TreeSet<OptStudent>(new SortByAge());
			set1.add(new OptStudent("Nipul", "Patel", "45", "5.9 feet"));
			set1.add(new OptStudent("Roni", "Jackson", "30", "5.8 feet"));
			set1.add(new OptStudent("Abhilash", "Madhvram", "33", "5.9 feet"));

			Iterator<OptStudent> itr1 = set1.iterator();
			while (itr1.hasNext()) {
				OptStudent student1 = itr1.next();
				System.out.println(student1.getAge() + "   " + student1.getFirstName() + " " + student1.getLastName()
						+ " " + student1.getHeight());
			}

		}

	}

}
