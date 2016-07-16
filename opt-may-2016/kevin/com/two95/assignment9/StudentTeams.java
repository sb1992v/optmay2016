package com.two95.assignment9;

import java.util.ArrayList;
import java.util.Collections;


public class StudentTeams {

	public static void main(String[] args) {
		ArrayList<StudentDetails> list=new ArrayList<StudentDetails>();
		list.add(new StudentDetails("Alen","1"));
		list.add(new StudentDetails("Kevin","3"));
		list.add(new StudentDetails("Manu","2"));
		list.add(new StudentDetails("Merin","5"));
		list.add(new StudentDetails("Jimly","7"));
		list.add(new StudentDetails("Ancia","4"));
		list.add(new StudentDetails("Gopika","6"));
		list.add(new StudentDetails("Shalu","8"));
		list.add(new StudentDetails("Sneha","9"));
		list.add(new StudentDetails("Roshini","10"));
	    int count=0;
	    Collections.shuffle(list);
	    System.out.println("*****First Team*****");
	    for(StudentDetails s:list){
	    	if(count==5){
	    		System.out.println("*****Second Team*****");
	    	}
	    	System.out.println("Name : "+s.getName());
    		count++;
	    }

	}

}
