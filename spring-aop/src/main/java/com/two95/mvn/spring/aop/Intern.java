package com.two95.mvn.spring.aop;

public class Intern implements RetailerAction {

	private String designation;
	private String name;
	private RetailService retailService;

	public void setRetailService(RetailService retailService) {
		this.retailService = retailService;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void doWork() {

		System.out.println(name + " is a " + designation + " and performs a work");
	}

}
