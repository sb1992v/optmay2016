package com.chapter7.assignment7_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class makeTeams {

	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<Student>();
		//HashSet<Student> team1 = 
		ArrayList<Student> list = new ArrayList<Student>();
		int n = 8;
		Student s1 = new Student("Ammu", "8");
		Student s2 = new Student("Appu", "7");
		Student s3 = new Student("Kevin", "2");
		Student s4 = new Student("Minnu", "3");
		Student s5 = new Student("Minju", "5");
		Student s6 = new Student("Titu", "6");
		Student s7 = new Student("Kannan", "4");
		Student s8 = new Student("Jeswin", "1");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		list.add(s8);
		int count = 0;
		Collections.shuffle(list);
		System.out.println("Team 1 Students");		
		for(Student s : list)
		{
			if(count==4)
				System.out.println("Team 2 students");
			System.out.println("Name : "+ s.getName());			
			count++;
		}
	}
}


