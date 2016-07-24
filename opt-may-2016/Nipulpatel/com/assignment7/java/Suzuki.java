
/***************************************************************
 * @author Nipul								 date:6/28/2016 
 * project:Assignment 7
 * Scope : Vehicle->Car->Suzuki relationship.
 * Scope change : none
 * class : Sub class of car
 ***************************************************************/
package com.assignment7.java;
 
public class Suzuki extends Car {

	private String CarName = "Suzuki";
	private String Model = "SX4";
	private String EnginType = "1.5 L M15A I4";

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

		System.out.println("Car Wash is Ready for Suzuki "+ Model);
	}
	@Override
	public String toString() {
		return "Suzuki [CarName=" + CarName + ", Model=" + Model + ", EnginType=" + EnginType + "]";
	}

}
