package com.two95.training.chapter7.assignments;

import java.util.Iterator;
import java.util.TreeSet;



public class EmployeeSorttest {
public static void main(String[] args) {
		
		
		TreeSet<Employee> set2 = new TreeSet<Employee>(new LastNameComparator());
		set2.add(new Employee("Abhilash", "Tinku", 24, 167));
		set2.add(new Employee("Venketash", "Sudha", 25, 162));
		set2.add(new Employee("Anusha", "Ratikrindi", 26, 31));
		set2.add(new Employee("Sooraj", "Kesavadas", 24, 165));
		set2.add(new Employee("Jaise", "John", 23, 164));
		set2.add(new Employee("Nipul", "Patel", 26, 169));
		set2.add(new Employee("Srikanth", "Rao", 25, 172));
		Iterator<Employee> itrat = set2.iterator();
		while (itrat.hasNext()) {
			Employee Employee2 = (Employee) itrat.next();
			System.out.println(Employee2.getLastName() + " " + Employee2.getFirstName() + " " + Employee2.getAge() + " "
					+ Employee2.getHeight());
		}
		System.out.println("-----------------------------");

}
}