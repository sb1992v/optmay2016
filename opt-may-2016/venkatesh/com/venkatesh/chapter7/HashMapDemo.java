package com.venkatesh.chapter7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class HashMapDemo {

	public static void main(String[] args) {

		Employee employee1 = new Employee(8, "venkatesh", "sudha");
		Employee employee2 = new Employee(3, "prasad", "kumar");
		Employee employee3 = new Employee(5, "vishwa", "kamity");

		Map map = new HashMap();

		map.put(8, employee1);
		map.put(3, employee2);
		map.put(5, employee3);

		Employee employee = (Employee) map.get(5);

		System.out.println(employee.getId() + " " + employee.getFirstName() + " " + employee.getFirstName());

	}

}
