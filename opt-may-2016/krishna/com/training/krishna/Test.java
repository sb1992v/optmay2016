package com.training.krishna;

import java.util.Iterator;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		TreeSet<Students> set = new TreeSet<Students>(new LastName());
		set.add(new Students("Kalyanam", "Krishna", 25, 168));
		set.add(new Students("Madhavaram", "Abhilash", 27, 172));
		set.add(new Students("Reddy", "Sankreeth", 25, 170));
		set.add(new Students("Patel", "Nipul", 24, 171));
		set.add(new Students("Subramaniam", "Vekatesh", 24, 170));
		Iterator<Students> itr = set.iterator();
		while (itr.hasNext()) {
			Students student = (Students) itr.next();
			System.out.println(student.getLastName() + " " + student.getFirstName() + " " + student.getAge() + " "
					+ student.getHeight() + " Centimeters");
		}

	}

}