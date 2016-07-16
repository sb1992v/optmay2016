package com.two95.ansari.assigncollections;

public class Employee implements Comparable {
	private String name;
	private int age;
	public Employee(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee : name=" + name + ", age=" + age ;
	}
	@Override
	public int compareTo(Object o) {
		Employee emp = (Employee)o;
		return this.name.compareTo(emp.name);
	}

}
