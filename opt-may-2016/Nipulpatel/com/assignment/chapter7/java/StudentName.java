/***************************************************************
 * @author Nipul								 date:7/8/2016 
 * project:Collection (Assignment 8)
 * Scope :practice Book examples
 * Scope change : none
 * class : Main class
 ***************************************************************/

package com.assignment.chapter7.java;

public class StudentName {

	String firstName;
	String email;

	public StudentName(String firstName, String email) {
		this.firstName = firstName;
		this.email = email;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
