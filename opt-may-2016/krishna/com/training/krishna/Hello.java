package com.training.krishna;

import java.lang.Integer;

public class Hello {
	public static void main(String args[]) {
		int i = 10;
		Integer ii = new Integer(i);
		add(ii);
	}

	static void add(Integer object) {
		int val = object.intValue() + 5;
		System.out.println(val);
	}
}