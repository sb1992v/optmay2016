package com.two95.mvn.spring.aop;

public class RetailService {

	
	public void scanObject() {
		System.out.println("Scan the bar code of the goods.");
	}
	
	public void getPayment() {
		System.out.println("Get the payment from the customer by cash or card");
	}
	
	public void printBill() {
		System.out.println("Prints the bill");
	}
	
	public void packGoods() {
		System.out.println("Packs the purchased goods");
	}
	
	public void transactionFailure() {
		System.out.println("Transaction failed due to card error or faulty goods.");
	}
}
