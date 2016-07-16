package com.ansari.assign.collections;
import java.util.*;
public class StudentSort {

	public static void main(String[] args) {
		ArrayList<Student> arraylist = new ArrayList<Student>();
		   arraylist.add(new Student(1, "Sooraj", 26));
		   arraylist.add(new Student(2, "Sankirth", 24));
		   arraylist.add(new Student(3, "Krishna", 32));
		   arraylist.add(new Student(4, "Venky", 25));
		   arraylist.add(new Student(5, "Nipul", 25));
		   arraylist.add(new Student(6, "Abilash", 12));
		   arraylist.add(new Student(7, "Anusha", 28));

		   Collections.sort(arraylist);

		   for(Student str: arraylist){
				System.out.println(str.getStudentname());
		   }
		}
	}


