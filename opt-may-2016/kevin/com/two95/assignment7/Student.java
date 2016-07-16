package com.two95.assignment7;

public class Student {
	String firstName;
	String lastName;
	String age;
	String height;
	public Student(String firstName,String lastName,String age,String height){
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
		this.height=height;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public String getAge(){
		return this.age;
	}
	public String getHeight(){
		return this.height;
	}

}
