package com.two95.training.chapter7.assignments;

public class Vehicle<T> {
	private String make;
	private T model;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public T getModel() {
		return model;
	}

	public void setModel(T model) {
		this.model = model;
	}

	public Vehicle(String make, T model) {
		super();
		this.make = make;
		this.model = model;
	}
	public Vehicle(){
		super();
	}

	public <T> void registers(T make, T model, T vehicleNo) {
		System.out.println("Your vehicle of model " + model + " and make " + make + " are being registered with the number "+vehicleNo);

	}

}
