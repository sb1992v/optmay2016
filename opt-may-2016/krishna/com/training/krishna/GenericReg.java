package com.training.krishna;

import java.util.Scanner;

public class GenericReg<Car> {
	private Car car;

	public void reg(Car car) {
		this.car = car;
	}

	public Car get() {
		return car;
	}

	public static void main(String[] args) {
		GenericReg<String> model = new GenericReg<String>();
		GenericReg<String> make = new GenericReg<String>();
		GenericReg<Integer> regNum = new GenericReg<Integer>();
		System.out.println("Please Register your new car with dmv");
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter your Model:");
		String a = ss.nextLine();
		model.reg(a);
		System.out.println("Enter Your Car Company:");
		String b = ss.nextLine();
		make.reg(b);
		System.out.println("Enter Your Registration Number:");
		int c = ss.nextInt();
		regNum.reg(c);
		System.out.println("Your " + model.get() + " car with " + make.get() + " make has Registration Number " + regNum.get());
		ss.close();
	}

}
