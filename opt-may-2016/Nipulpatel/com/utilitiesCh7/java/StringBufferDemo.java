
/***************************************************************
 * @author Nipul								 date:7/8/2016 
 * project:Collection (Assignment 8)
 * Scope :practice Book examples
 * Scope change : none
 * class : Main class
 ***************************************************************/

package com.utilitiesCh7.java;

public class StringBufferDemo {
 
	public static void main(String[] args) {
		try{

		StringBuffer buffer = new StringBuffer();
		
		buffer.append("Append is a method  ");
		
		buffer.append("Buffer is a object refrerance ");
		
		buffer.append("This is Nipul");
		
		buffer.insert(50, " Hello ");
		
		
		String finalText = buffer.toString();
		
		System.out.println(finalText);
		int lentgh = finalText.length();
		System.out.println("The lentgh of the string is " + lentgh);}
		
		catch(java.lang.StringIndexOutOfBoundsException ae){
			System.out.println("StringIndexOutOfBound Exception has been handeled ");
		}
	}

}
