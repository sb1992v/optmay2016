
/***************************************************************
 * @author Nipul								 date:7/8/2016 
 * project:Collection (Assignment 8)
 * Scope :practice Book examples
 * Scope change : none
 * class : Main class
 ***************************************************************/
package com.utilitiesCh7.java;

import java.util.*;
 
public class HashMapDemo {

	public static void main(String[] args) {

		// Create 3 Customers
		Customer c1 = new Customer("John", "Smith", 12345);
		Customer c2 = new Customer("Laura", "Jackson", 456546);
		Customer c3 = new Customer("Thomas", "Edison", 78989);
		// Create a hashmap
		HashMap<String, Customer> map = new HashMap<String, Customer>();
		// Store the data using ssn as the key
		// creating a map object with the generic format  
		map.put("12345", c1);
		map.put("345678", c2);
		map.put("98765", c3);
		// Get Smiths info
		
		Customer customer = map.get("345678");
		// casting is not needed
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " " + customer.getSsn());
	}

}
