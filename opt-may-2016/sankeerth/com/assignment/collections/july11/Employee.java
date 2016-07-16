package com.assignment.collections.july11;

@SuppressWarnings("rawtypes")
public class Employee implements Comparable {

	private String name;
	private int age;
	
	public Employee(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	@Override
	public int compareTo(Object o) {
		Employee emp = (Employee) o;
		return this.name.compareTo(emp.name);
	}
	
	public String toString(){
		return "Employee name: " + name + " | Age: " + age;
	}

}
