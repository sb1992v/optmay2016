package com.two95.Sooraj;

public class Car extends Vehicle {
	private String company;
	private String model;
	private int registration_no;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getRegistration_no() {
		return registration_no;
	}
	public void setRegistration_no(int registration_no) {
		this.registration_no = registration_no;
	}
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String category, String number, String cost1) {
		super(category, number, cost1);
		// TODO Auto-generated constructor stub
	}
	public void execution(){
		System.out.println("The model is  "+model+" and the company name is "+company);
	}
	

}
