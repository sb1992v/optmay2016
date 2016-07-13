package com.two95.training.chapter7;

public class Customer implements Comparable<Customer>{
	
	String firstName;
	String lastName;
	int age;
	int ssn;
	public Customer(String firstName, String lastName, int ssn, int age) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.ssn = ssn;
	this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	@Override
	public int compareTo(Customer s1) {
		if(this.age>s1.age) {
			return 1;
		} else if(this.age<s1.age) {
			return -1 ;
		} else {
			return 0;
		}
	}

}
