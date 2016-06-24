package com.two95.Sooraj;

public class Vehicle {
	private String category;
	private String number;
	private String cost1;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCost1() {
		return cost1;
	}
	public void setCost1(String cost1) {
		this.cost1 = cost1;
	}
	public Vehicle (){
	}
	
	public Vehicle(String category, String number, String cost1) {
		super();
		this.category = category;
		this.number = number;
		this.cost1 = cost1;
	}
	public void execute(){
		System.out.println("The category is "+category+", the number required is "+number+" and the cost is "+cost1);
	
	
	}
}

