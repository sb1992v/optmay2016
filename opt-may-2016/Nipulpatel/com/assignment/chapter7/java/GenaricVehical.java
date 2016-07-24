/***************************************************************
 * @author Nipul								 date:7/8/2016 
 * project:Generic (Assignment 8)
 * Scope :Create a Generic Vehicle class which accepts any type
 *  of vehicles and registers them, prints the make & model of 
 *  the Vehicle.
 * Scope change : none
 * class : Main class
 ***************************************************************/

package com.assignment.chapter7.java;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.assignment.chapter6.java.MyCustomException;

public class GenaricVehical<Vehicle> {

	public static void main(String[] args) throws MyCustomException {

		try {
			int number;
			Scanner userInput;
			Scanner scanner = userInput = new Scanner(System.in);
			System.out.println("Hello ,Welcome to registration");
			System.out.println("Press 0 for Car registration");
			System.out.println("Press 1 for Truck registration");
			System.out.println("Press 2 for Bike registration");
			number = userInput.nextInt();

			if (number > 2) {
				throw new MyCustomException("Input must be between 0 to 2");
			} else {

				if (number == 0) {
					List<String> int1 = new ArrayList<>();
					int1.add("car is ready for registration");
					String str1;
					// Get the objects
					str1 =  int1.get(number);
					System.out.println(str1);
					String carName = "CRV";
					String CarMaker = "Honda";
					System.out.println("If you want to see car name and maker then press 1");
					Scanner userInput1 = new Scanner(System.in);
					int number1 = userInput.nextInt();

					if (number1 == 1) {
						System.out.println("Car name is " + carName);
						System.out.println("Car maker is " + CarMaker);
					}

				} else if (number == 1) {

					List<String> int2 = new ArrayList<>();
					int2.add("");
					int2.add("truck is ready for registration");
					String str2;
					// Get the objects
					str2 = int2.get(number);
					System.out.println(str2);
					String truckName = "SILVERADO 1500";
					String truckMaker = "Chevrolet";
					System.out.println("If you want to see truck name and maker then press 1");
					Scanner userInput2 = new Scanner(System.in);
					int number2 = userInput.nextInt();

					if (number2 == 1) {
						System.out.println("Truck name is " + truckName);
						System.out.println("Truck maker is " + truckMaker);

					}

				} else if (number == 2) {
					List<String> int3 = new ArrayList<>();
					int3.add("sdf");
					int3.add("sdf");
					int3.add("Bike is ready for registration");

					String str3;
					// Get the objects
					str3 = int3.get(number);
					// Do not have to cast it
					System.out.println(str3);
					String bikekName = "Yamaha FZ 150cc";
					String bikeMaker = "Yamaha";
					System.out.println("If you want to see Bike name and maker then press 1");
					Scanner userInput3 = new Scanner(System.in);
					int number3 = userInput.nextInt();

					if (number3 == 1) {
						System.out.println("Bike name is " + bikekName);
						System.out.println(" maker is " + bikeMaker);

					}

				}

			}
		} catch (java.lang.IndexOutOfBoundsException IOB) {
			System.out.println("Exception Index Out Of Bounds is handled ");
		}

		catch (java.util.InputMismatchException IME) {
			System.out.println("Exception Input Mismatch is handled ");
		}

	}
}
