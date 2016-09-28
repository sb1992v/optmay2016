package com.two95.mvn.spring.aop;

public class Cashier implements RetailerAction{
	
	private RetailService retailService;
	private String designation;
	private String name;

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRetailService(RetailService retailService) {
		this.retailService = retailService;
	}
	
	public void doWork() {
		try {
			//retailService.scanObject();
			//retailService.getPayment();
			System.out.println(name+" is a " +designation + " and performs a work");
			//retailService.packGoods();
			//retailService.printBill();
		} catch (Exception e) {
			//retailService.transactionFailure();
		}
	}
}
