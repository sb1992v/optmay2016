package com.two95.assignment9;

public class StudentDetails {
	private String name;
	private String rollNo;
	public StudentDetails(String name,String rollNo){
		super();
		this.name=name;
		this.rollNo=rollNo;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getRollNo(){
		return rollNo;
	}
	public void setRollNo(String rollNo){
		this.rollNo=rollNo;
	}

}
