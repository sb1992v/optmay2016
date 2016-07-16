package com.ansari.assign.collections;

public class Employee {
	String Name;
	String age;

	public Employee(String Name, String age) {
		super();
		this.Name = Name;
		this.age = age;
	}

	public Employee() {

	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String toString() {
		return "Name: " + this.Name + "-- Age: " + this.age;
	}

}