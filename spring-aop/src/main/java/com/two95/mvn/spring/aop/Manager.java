package com.two95.mvn.spring.aop;

public class Manager implements RetailerAction {

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

	/* (non-Javadoc)
	 * @see com.two95.mvn.spring.aop.RetailerAction#doWork()
	 */
	public void doWork() {
		// retailService.scanObject();
		// retailService.getPayment();
		System.out.println(name + " is a " + designation + " and performs a work");
		// retailService.packGoods();
		// retailService.printBill();
	}
}
