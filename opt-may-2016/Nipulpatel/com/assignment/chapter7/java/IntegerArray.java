/***************************************************************
 * @author Nipul								 date:7/13/2016 
 * project:Collection (Assignment 8)
 * Scope : Write a java program Create an Integer array with number 
 * 33,31,32,33,33,31,33,32
 * and print the following using collection
 * 31 - 2 times
 * 32 - 2 times
 * 33 - 4 times
 * Scope change : none
 * class : Main class
 ***************************************************************/


package com.assignment.chapter7.java; 

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class IntegerArray {

	public static void main(String[] args) {
		
		
		 List<Integer> number = new ArrayList<>();
		
		number.add(33);
		number.add(31);
		number.add(32);
		number.add(33);
		number.add(33);
		number.add(31);
		number.add(32);
		
		
		
		System.out.println(number.get(0)+" ," + number.get(4)+" ," + number.get(3));
		System.out.println(number.get(2)+" ," + number.get(6));
		System.out.println(number.get(1)+" ," + number.get(5));
		
		
		
	}

}
