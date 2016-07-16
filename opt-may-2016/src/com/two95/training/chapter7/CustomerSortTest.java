package com.two95.training.chapter7;

import java.util.Iterator;
import java.util.TreeSet;

public class CustomerSortTest {

	public static void main(String[] args) {
		
		
		TreeSet<Customer> set2 = new TreeSet<Customer>();
		set2.add(new Customer("John", "Smith", 52345, 51));
		set2.add(new Customer("Zaura", "Jackson", 456546, 21));
		set2.add(new Customer("Thomas", "Edison", 78989, 31));
		Iterator<Customer> itrat = set2.iterator();
		while (itrat.hasNext()) {
			Customer customer2 = (Customer) itrat.next();
			System.out.println(customer2.getLastName() + " " + customer2.getFirstName() + " " + customer2.getSsn() + " "
					+ customer2.getAge());
		}
		System.out.println("-----------------------------");

		TreeSet<Customer> set = new TreeSet<Customer>(new FirstNameComparator());
		set.add(new Customer("John", "Smith", 52345, 51));
		set.add(new Customer("Zaura", "Jackson", 456546, 21));
		set.add(new Customer("Thomas", "Edison", 78989, 31));
		Iterator<Customer> itr = set.iterator();
		while (itr.hasNext()) {
			Customer customer = (Customer) itr.next();
			System.out.println(customer.getLastName() + " " + customer.getFirstName() + " " + customer.getSsn() + " "
					+ customer.getAge());

		}
		System.out.println("-----------------------------");
		TreeSet<Customer> set1 = new TreeSet<Customer>(new LastNameComparator());
		set1.add(new Customer("John", "Smith", 52345, 51));
		set1.add(new Customer("Zaura", "Jackson", 456546, 21));
		set1.add(new Customer("Thomas", "Edison", 78989, 31));
		Iterator<Customer> itra = set1.iterator();
		while (itra.hasNext()) {
			Customer customer1 = (Customer) itra.next();
			System.out.println(customer1.getLastName() + " " + customer1.getFirstName() + " " + customer1.getSsn() + " "
					+ customer1.getAge());
		}
		

		// TreeSet<String> list = new TreeSet<String>();
		// list.add("abc");
		// list.add("def");
		// list.add("zhi");
		// list.add("jkl");
		// Iterator<String> it = list.iterator();
		// while (it.hasNext()) {
		// System.out.println(it.next());
	}
}
