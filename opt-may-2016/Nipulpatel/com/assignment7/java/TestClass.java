
/***************************************************************
 * @author Nipul								 date:6/28/2016 
 * project:Assignment 7(Referential Polymorphism)
 * Scope :assignment :
 * Create a Vehicle->Car->Honda relationship.
                   Car->Toyota
                   Car->Suzuki
                   Vehicle->Truck       
 * Create a CarWash which can wash all 3 types of Cars.
 * Create a ToyotaDealer  which only can sell Toyota Cars.
 * Create a DMV which can register any Vehicles
 * Scope change : none
 * class : Main class (Test class )
 * Result:
-------------Honda-----------------
Honda [CarName=Honda, Model=CRV, EnginType=2.4-liter i-VTEC]
Car Wash is Ready for Honda CRV
Your Vehicle is authorized for  Registration
-------------Toyota-----------------
ToyotaDealer [CarName=Toyota, Model=RAV4, EnginType=2.5 L 4-cylinder]
Welcome,We have your Toyota dream car
Car Wash is Ready for Toyota RAV4
Your Vehicle is authorized for  Registration
-------------Suzuki-----------------
Suzuki [CarName=Suzuki, Model=SX4, EnginType=1.5 L M15A I4]
Car Wash is Ready for Suzuki SX4
Your Vehicle is authorized for  Registration
-------------Truck--------------------
This is a Truck
Truck [TruckName=Chevrolet, TruckModel=SILVERADO 1500,[
 TruckEnginType= 4.3L FlexFuel EcoTec3 V6]
Your Vehicle is authorized for  Registration
---------------------------------------
***************************************************************/

package com.assignment7.java;
 
public class TestClass {

	public static void main(String[] args) {

		Car honda = new Honda();
		System.out.println("-------------" + honda.getCarName() + "-----------------");
		System.out.println(honda.toString());
		honda.carWash();// car wash is only for cars
		honda.dmvRegistration(); // DMV registration is loosely coupled.

		Car toyota = new Toyota();
		System.out.println("-------------" + toyota.getCarName() + "-----------------");
		// by only changing a reference(same method ,same name) we can Access
		// different class.
		System.out.println(toyota.toString());
		// Ref3.Toyotasell(); is not possible. throwing error.its tightly
		// coupled.
		// you should go to the Toyota Dealer then.
		ToyotaDealer sell = new ToyotaDealer();
		sell.toyotaSell(new ToyotaDealer());
		// p.ToyotaSell(p); This will also print same result.
		// created ToyotaSell method which invokes Sell method .
		// Now by creating a new Toyota object it can invokes ToyotaSell method.
		toyota.carWash();// Ref3 is for Toyota class
		toyota.dmvRegistration();

		Car suzuki = new Suzuki();
		System.out.println("-------------" + suzuki.getCarName() + "-----------------");
		System.out.println(suzuki.toString());
		suzuki.carWash();// car wash is only for cars
		suzuki.dmvRegistration(); // DMV registration is loosely coupled.
		System.out.println("-------------Truck--------------------");

		Vehicle truck = new Truck();
		System.out.println(truck.toString());
		truck.dmvRegistration();
		System.out.println("---------------------------------------");
	}

}
