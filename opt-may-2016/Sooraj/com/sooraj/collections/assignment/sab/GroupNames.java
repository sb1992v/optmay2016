package com.sooraj.collections.assignment.sab;

import java.util.*;


public class GroupNames {
	public static void main(String[] args) {
		Map<String, String> students = new HashMap<String, String>();
		students.put("1","Sooraj");
		students.put("2","Roni");
		students.put("3","Sankirth");
		students.put("4","Krishna");
		students.put("5","Venky");
		students.put("6","Abhilash");
		students.put("7","Nipul");
		students.put("8","Saranya");
		students.put("9","Anusha");
		students.put("10","Dayana");
		students.put("11","Jaise");
		students.put("12","Kevin");
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 13; i++) {
			list.add(new Integer(i));
		}
		System.out.println("Group1");
		System.out.println("---------------");
		
		Collections.shuffle(list);
		for (int i = 0; i < 12; i++) {
			int a= list.get(i);
			String val = String.valueOf( a );
			if(i==6){
				System.out.println("");
				System.out.println("Group2");
				System.out.println("----------------------");
			}
			System.out.println(students.get(val));
		}
	}
}
