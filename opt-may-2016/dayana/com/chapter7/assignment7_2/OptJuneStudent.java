package com.chapter7.assignment7_2;

import java.util.List;

public class OptJuneStudent {
	private String name;
	private String email;
	
	public OptJuneStudent(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "OptJuneStudent [name=" + name + ", email=" + email + "]";
	}
	public static void display(List<OptJuneStudent> students)
	{
		for(OptJuneStudent student : students)
		{
			System.out.println(" Name : " + student.getName() + " Email : " + student.getEmail());
			
		}
	}
}
