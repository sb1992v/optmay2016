package com.two95;

import com.two95.mvn.spring.aop.RetailService;

public class Test {

	private RetailService retailService;
	
	public void setRetailService(RetailService retailService) {
		this.retailService = retailService;
	}

	public void doWork() {
		System.out.println("Orphan do work method");
	}
}
