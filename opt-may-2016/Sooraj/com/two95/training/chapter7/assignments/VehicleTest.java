package com.two95.training.chapter7.assignments;

public class VehicleTest {
	
	public static void main(String[] args) {
		Vehicle<String> Honda  = new Vehicle<String> ("2002", "modelT");
		Honda.registers("2008", "I80", "K825698");
		Vehicle<String> Civic  = new Vehicle<String> ("2002", "modelT");
		Civic.registers("2004", "black", "458235");
		
	}

}
