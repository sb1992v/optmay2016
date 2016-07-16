package com.anusha.training;

public class ArrayException {

	public static void main(String[] args) {
		try{
		int a[]=new int [2];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		System.out.println("hello java");
		} catch (ArrayIndexOutOfBoundsException ae){
		System.out.println("ArrayIndexOutOfBounds exception handled");
	

	}

	}
}
