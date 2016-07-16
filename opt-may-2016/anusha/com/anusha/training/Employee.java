package com.anusha.training;

public class Employee implements Comparable<Employee> {
	public String Name;
	public int age;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Employee arg0) {
		return this.getName().compareTo(arg0.Name);
	}
	@Override
	public String toString() {
		return "EmployeeObjects [Name=" + Name + ", age=" + age + "]";
	}
	
	
	

}



	