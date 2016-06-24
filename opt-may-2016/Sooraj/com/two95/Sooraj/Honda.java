package com.two95.Sooraj;

public class Honda extends Car{
	private int mileage;
	private String cost;
	private String engine_no;
	private Showroom showroom;
	
	public Showroom getShowroom() {
		return showroom;
	}
	public void setShowroom(Showroom showroom) {
		this.showroom = showroom;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public Honda(){
		
	}
	public Honda(int mileage, String cost) {
		
		this.mileage = mileage;
		this.cost = cost;
	}
	
	public Honda(int mileage, String cost, String engine_no, Showroom showroom) {
		super();
		this.mileage = mileage;
		this.cost = cost;
		this.engine_no = engine_no;
		this.showroom = showroom;
	}
	public String getEngine_no() {
		return engine_no;
	}
	public void setEngine_no(String engine_no) {
		this.engine_no = engine_no;
	}
	@Override
	public String toString() {
		return "Honda [mileage=" + mileage + ", cost=" + cost + ", engine_no=" + engine_no + "]";
	}
	

}
