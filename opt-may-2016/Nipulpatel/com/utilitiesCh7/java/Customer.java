/***************************************************************
 * @author Nipul								 date:7/8/2016 
 * project:Collection (Assignment 8)
 * Scope :practice Book examples
 * Scope change : none
 * class : Main class
 ***************************************************************/


package com.utilitiesCh7.java;

public class Customer {

	String firstName;
	String lastName;
	int ssn;

	public Customer(String firstName, String lastName, int ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getSsn() {
		return this.ssn;
	}

}
