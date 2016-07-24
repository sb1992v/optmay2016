/***************************************************************
 * @author Nipul								 date:6/28/2016 
 * project:Assignment 7
 * Scope : Vehicle->Car->Honda relationship.
 * Scope change : none
 * class : Sub class of car
 ***************************************************************/
package com.assignment7.java;

public class Honda extends Car {
     
	private String CarName = "Honda";
	private String Model = "CRV";
	private String EnginType = "2.4-liter i-VTEC";
	
	
	public String getCarName() {
		return CarName;
	}


	public void setCarName(String carName) {
		CarName = carName;
	}


	public String getModel() {
		return Model;
	}


	public void setModel(String model) {
		Model = model;
	}


	public String getEnginType() {
		return EnginType;
	}


	public void setEnginType(String enginType) {
		EnginType = enginType;
	}
	@Override
	public void carWash() {

		System.out.println("Car Wash is Ready for Honda "+Model);
	}
	@Override
	public String toString() {
		return "Honda [CarName=" + CarName + ", Model=" + Model + ", EnginType=" + EnginType + "]";
	}

	

}
