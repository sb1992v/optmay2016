package com.two95.assignment7;

public class GenericVehicleTest {

	public static void main(String[] args) {
		GenericVehicle<Vehicle> vehicle=new GenericVehicle<Vehicle>();
	    vehicle.register(new Vehicle("Toyota",2016));
	    Vehicle veh=vehicle.display();
	    System.out.println("The model of the car is "+veh.getModel()+" and the year of manufacture is "+veh.getMake());
			
			}

	}

