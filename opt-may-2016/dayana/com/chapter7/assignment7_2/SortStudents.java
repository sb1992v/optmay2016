package com.chapter7.assignment7_2;

import java.util.Iterator;
import java.util.TreeSet;

public class SortStudents {
	public static void main(String[] args)
	{
		TreeSet<Student> set = new TreeSet<Student>(new FirstNameComparator());
		set.add(new Student("Dayana", "Sunny","24","5.5"));
		set.add(new Student("Kevin","Santhosh","21","5.8"));
		set.add(new Student("Abeyn","Sajan","25","5.5"));
		set.add(new Student("Dennis","Sunny","21","5.8"));
		Iterator<Student> itr = set.iterator();
		while(itr.hasNext())
		{
			Student student = itr.next();
			System.out.println(student.getFirstName() + " "+ student.getLastName()+ " "+ student.getAge()+ " "+student.getHeight());
		}
		System.out.println("=======================================================================");
		TreeSet<Student> set1 = new TreeSet<Student>(new LastNameComparator());
		set1.addAll(set);
		Iterator<Student> itr1 = set1.iterator();
		while(itr1.hasNext())
		{
			Student student = itr1.next();
			System.out.println(student.getFirstName() + " "+ student.getLastName()+ " "+ student.getAge()+ " "+student.getHeight());
		}
		
		System.out.println("=======================================================================");
		TreeSet<Student> set2 = new TreeSet<Student>(new AgeComparator());
		set2.addAll(set);
		Iterator<Student> itr2 = set2.iterator();
		while(itr2.hasNext())
		{
			Student student = itr2.next();
			System.out.println(student.getFirstName() + " "+ student.getLastName()+ " "+ student.getAge()+ " "+student.getHeight());
		}
		
		System.out.println("=======================================================================");
		TreeSet<Student> set3 = new TreeSet<Student>(new HeightComparator());
		set3.addAll(set);
		Iterator<Student> itr3 = set3.iterator();
		while(itr3.hasNext())
		{
			Student student = itr3.next();
			System.out.println(student.getFirstName() + " "+ student.getLastName()+ " "+ student.getAge()+ " "+student.getHeight());
		}
		
	} 
}
