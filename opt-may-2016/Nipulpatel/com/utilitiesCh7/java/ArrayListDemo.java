
/***************************************************************
 * @author Nipul								 date:7/8/2016 
 * project:Collection (Assignment 8)
 * Scope :practice Book examples
 * Scope change : none
 * class : Main class
 ***************************************************************/


package com.utilitiesCh7.java;
import java.util.*;
public class ArrayListDemo {
 
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		// Add objects.
		list.add("Hello");
		list.add("World");
		list.add("World");
		list.add("ABC");
		
		String s1 =  null;
		//Get the objects
		
		 s1 = list.get(0);
		
		
		System.out.println(s1);
	} 

}
