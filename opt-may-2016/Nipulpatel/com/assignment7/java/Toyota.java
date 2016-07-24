/***************************************************************
 * @author Nipul								 date:6/28/2016 
 * project:Assignment 7
 * Scope : Vehicle->Car->Toyota relationship.
 * Scope change : none
 * class : Sub class of car 
 ***************************************************************/
package com.assignment7.java;

public class Toyota extends Car {
 
	public String CarName = "Toyota";
	public String Model = "RAV4";
	public String EnginType = "2.5 L 4-cylinder";

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

	public void carWash() {

		System.out.println("Car Wash is Ready for Toyota " + Model);
	}

	@Override
	public String toString() {
		return "ToyotaDealer [CarName=" + CarName + ", Model=" + Model + ", EnginType=" + EnginType + "]";
	}

}
