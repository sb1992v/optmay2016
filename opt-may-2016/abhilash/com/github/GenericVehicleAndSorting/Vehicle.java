package com.github.GenericVehicleAndSorting;

//CarDetails is generic name 

public class Vehicle<CarDetails> {
	
	//carDetails is an object of generic [CarDetails]	
	private CarDetails carDetails;
	
	public void registration(CarDetails carDetails){
		this.carDetails=carDetails;
	}
	 
	//output is a method name to return carDetails[object] values	
	public CarDetails output() {
	    return carDetails;
	  }


	public static void main(String[] args){
		System.out.print("Registered Vehicle is ");
		
		Vehicle<String> carModel = new Vehicle<String>();
			carModel.registration("x1");
		
		Vehicle<String> carMake = new Vehicle<String>();
			carMake.registration("BMW");
		
		Vehicle<Integer> yearMade = new Vehicle<Integer>();
			yearMade.registration(2016);
			
			
			System.out.println("Car \nModel is " + carModel.output());
			System.out.println("Car made by " +carMake.output());
			System.out.println("Year made "+yearMade.output());


		
	}
	
}
