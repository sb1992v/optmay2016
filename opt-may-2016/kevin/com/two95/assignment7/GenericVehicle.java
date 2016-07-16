package com.two95.assignment7;

public class GenericVehicle<Vehicle> {
	
		private  Vehicle v;
		public void register(Vehicle v){
			this.v=v;
			System.out.println("The vehicle is registered");
		}
		public Vehicle display(){
			return v;
		}

		

	}

