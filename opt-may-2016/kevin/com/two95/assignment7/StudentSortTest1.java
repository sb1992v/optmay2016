package com.two95.assignment7;
import java.util.*;
public class StudentSortTest1 {

	public static void main(String[] args) {
		TreeSet set=new TreeSet(new LastNameComparator());
		TreeSet set1=new TreeSet(new FirstNameComparator());
		TreeSet set2=new TreeSet(new AgeComparator());
		TreeSet set3=new TreeSet(new HeightComparator());
		set.add(new Student("Anusha","Rao","24","172.5"));
		set.add(new Student("Abilash","Madavaram","23","180.0"));
		set.add(new Student("Krishna","Kalyanam","25","179.2"));
		set.add(new Student("Kevin","Santhosh","21","175.5"));
		set.add(new Student("Dayana","Sunny","22","173.2"));
		set1.add(new Student("Anusha","Rao","24","172.5"));
		set1.add(new Student("Abilash","Madavaram","23","180.0"));
		set1.add(new Student("Krishna","Kalyanam","25","179.2"));
		set1.add(new Student("Kevin","Santhosh","21","175.5"));
		set1.add(new Student("Dayana","Sunny","22","173.2"));
		set2.add(new Student("Anusha","Rao","24","172.5"));
		set2.add(new Student("Abilash","Madavaram","23","180.0"));
		set2.add(new Student("Krishna","Kalyanam","25","179.2"));
		set2.add(new Student("Kevin","Santhosh","21","175.5"));
		set2.add(new Student("Dayana","Sunny","22","173.2"));
		set3.add(new Student("Anusha","Rao","24","172.5"));
		set3.add(new Student("Abilash","Madavaram","23","180.0"));
		set3.add(new Student("Krishna","Kalyanam","25","179.2"));
		set3.add(new Student("Kevin","Santhosh","21","175.5"));
		set3.add(new Student("Dayana","Sunny","22","173.2"));
		
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			Student student=(Student)itr.next();
			System.out.println(student.getLastName()+" "+student.getFirstName()+" "+student.getAge()+" "+student.getHeight()+" ");
		}
		System.out.println("**************************************");
		Iterator itr1=set1.iterator();
		while(itr1.hasNext()){
			Student student=(Student)itr1.next();
			System.out.println(student.getFirstName()+" "+student.getLastName()+" "+student.getAge()+" "+student.getHeight()+" ");
		}
		System.out.println("***************************************");
		Iterator itr2=set2.iterator();
		while(itr2.hasNext()){
			Student student=(Student)itr2.next();
			System.out.println(student.getFirstName()+" "+student.getLastName()+" "+student.getAge()+" "+student.getHeight()+" ");
		}
		System.out.println("****************************************");
		Iterator itr3=set3.iterator();
		while(itr3.hasNext()){
			Student student=(Student)itr3.next();
			System.out.println(student.getFirstName()+" "+student.getLastName()+" "+student.getAge()+" "+student.getHeight()+" ");
		}
		

	}

}
