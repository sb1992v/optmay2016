package com.two95.chapter7;

public class CustomerDetails {
	String firstName;
	String lastName;
	int ssn;
	public CustomerDetails(String firstName,String lastName,int ssn){
		this.firstName=firstName;
		this.lastName=lastName;
		this.ssn=ssn;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public int getSsn(){
		return this.ssn;
	}

}
