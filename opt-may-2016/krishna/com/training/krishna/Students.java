package com.training.krishna;

public class Students {

	String firstName;
	String lastName;
	int age;
	int height;

	// create a constructor and use getters and setters
	public Students(String lastName, String firstName, int age, int height) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.height = height;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFristName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}