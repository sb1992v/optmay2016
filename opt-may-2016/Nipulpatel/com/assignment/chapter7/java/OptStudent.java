/***************************************************************
 * @author Nipul								 date:7/8/2016 
 * project:Collection (Assignment 8)
 * Scope :Sort and print the students in opt-june batch by last
 *  name, age, first name and height 
 * Scope change : none
 * class : Comparator
 ***************************************************************/

package com.assignment.chapter7.java;

public class OptStudent {

	String firstName;
	String lastName;
	String age;
	
	
	String height;

	public OptStudent(String firstName, String lastName, String age, String height) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;// Height

		
		
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}


}
