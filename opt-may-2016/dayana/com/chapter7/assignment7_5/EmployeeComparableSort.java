package com.chapter7.assignment7_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeComparableSort {

	public static void main(String[] args) {
		ArrayList<Employee> alist = new ArrayList<Employee>();
		alist.add(new Employee("Dayana","908890","Developer","24"));
		alist.add(new Employee("Kevin","118890","Developer","21"));
		alist.add(new Employee("Arrun","222222","Manager","26"));
		alist.add(new Employee("RoseMary","128890","HR","25"));
		alist.add(new Employee("JImmy","568890","Recriter","30"));

		System.out.println("Employees sorted based on name");
		Collections.sort(alist);
		Iterator itr = alist.iterator();
		while(itr.hasNext())
		{
			Employee emp = (Employee) itr.next();
			System.out.println("Name : " +emp.getName() + " Employee ID : "  + emp.getEmployeeId() + " Designation : " + emp.getDesignation());
		}
		
		System.out.println("=======================================================\n Employees sorted based on age");
		
		ArrayList<Employee> alist1 = new ArrayList<Employee>();
		alist1.addAll(alist);
		Collections.sort(alist1, new AgeComparator());
		Iterator itr1 = alist1.iterator();
		while(itr1.hasNext())
		{
			Employee emp = (Employee) itr1.next();
			System.out.println("Name : " +emp.getName() + " Age : "  + emp.getAge() + " Designation : " + emp.getDesignation());
		}
	}

}
