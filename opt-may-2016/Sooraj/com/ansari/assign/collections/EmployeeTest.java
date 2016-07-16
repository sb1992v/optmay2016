package com.ansari.assign.collections;

import java.util.*;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> Nset = new ArrayList<Employee>();
		Nset.add(new Employee("Sooraj", "24"));
		Nset.add(new Employee("Jaise", "25"));
		Nset.add(new Employee("Venky", "26"));
		Nset.add(new Employee("Anusha", "21"));
		Nset.add(new Employee("Kevin", "19"));
		Nset.add(new Employee("Jeffin", "28"));
		Nset.add(new Employee("Dayana", "26"));
		Nset.add(new Employee("Sankirth", "24"));
		Collections.sort(Nset, new NameComparator());
		for(Employee e:Nset){
			 System.out.println(e);

		}
System.out.println("----------------------------------");

Collections.sort(Nset, new AgeComparator());
for(Employee e:Nset){
	 System.out.println(e);
	}
}}