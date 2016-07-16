package com.chapter7.assignment7_5;

public class Employee implements Comparable{
	private String name;
	private String employeeId;
	private String designation;
	private String age;
	public Employee(String name, String employeeId, String designation, String age) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.designation = designation;
		this.age = age;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public int compareTo(Object emp) {
		Employee employee = (Employee) emp;
		int id = this.getName().compareTo(employee.getName());
		return id;
	}

}
