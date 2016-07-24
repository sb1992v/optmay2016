/***************************************************************
 * @author Nipul								 date:7/13/2016 
 * project:Collection (Assignment 8)
 * Scope :Write a java program to read the line from the user and print 
 *        the most used word in the line
 *  output
 * -------
 *  Enter your line: java php java ruby java php python 
 *  Most repeated word is: java
 * Scope change : none
 * class : Main class
 ***************************************************************/

 

package com.assignment.chapter7.java;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PrintMostUsed {
	
	public static void main(String[] args) {
		
		String s;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
	      s = in.nextLine();
	     

    String value = s;

    String item[] = value.split(" ");

    HashMap<String, Integer> map = new HashMap<>();

    for (String t : item) {
        if (map.containsKey(t)) {
            map.put(t, map.get(t) + 1);

        } else {
            map.put(t, 1);
        }
    }
    Set<String> keys = map.keySet();
    for (String key : keys) {
        System.out.print(" " +key+"   ");
        System.out.println(map.get(key));
    }

}
}
		

	

