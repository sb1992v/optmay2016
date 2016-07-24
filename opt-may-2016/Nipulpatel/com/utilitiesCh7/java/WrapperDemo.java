
/***************************************************************
 * @author Nipul								 date:6/28/2016 
 * project:Wrapper Class 
 * Scope : Practices to a wrapper class methods 
 * Scope change : none
 * class : Main class
 ***************************************************************/

package com.utilitiesCh7.java;

import java.lang.Integer;
 
public class WrapperDemo {
	public static void main(String args[]) {
		int i = 10;
		// Wrap i in the object
		Integer ii = new Integer(i);

		// Pass the object ii as a parameter
		add(ii);

		/************************* String *******************************/
		String str = "This is realy realy big string";
		int l = str.length();
		System.out.println("The lentgh of the string is " + l);
		// l is a reference which is points to string
		// length is a method which gives a length of a string
		String st = str.substring(21);
		String st2 = str.substring(8, 23);
		System.out.println(st);
		System.out.println(st2);
		char ch = str.charAt(8);
		System.out.println("the charachter is " + ch);

		// ->First write a data type
		// ->Reference where you want to store the data
		// -> instance of a class
		// -> Method name (pass the argument)
		int index = str.indexOf("realy");
		int index2 = str.indexOf("string");
		System.out.println("The index of given string is " + index);
		System.out.println("The index of given string is " + index2);

		String str1 = "Hello";
		if (str1.equals("Hello")) {
			System.out.println("String are equals");
		} else {
			System.out.println("String are not equals");
		}
	
	String oldText = "nipul patel";
	String newText = oldText.toUpperCase();
	System.out.println("Uppercase is "+newText); }

	/****************************************************************/

	

	static void add(Integer object)
	// passing an argument via add(ii) to add method.
	// add is a static method so do not need a instance of a class
	// we are passing a object as a argument ,Integer is a object that we
	// created
	// Previously and object is a reference which points to Integer ,Integer
	// have a (i)

	{
		int val = object.intValue() + 5;
		System.out.println("Result is " + val);
		// This method returns the numeric value
		// represented by this object after conversion to type int.
		// Bye creating a val reference we are points to object which points to
		// Integer ,Integer is nothing but i=10
	}
}
