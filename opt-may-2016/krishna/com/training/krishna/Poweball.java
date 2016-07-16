package com.training.krishna;

import java.util.ArrayList;
import java.util.Collections;

public class Poweball {

	public static void main(String[] args) {
		System.out.println("The Lucky Five Ball are: ");
		ArrayList<Integer> powerBall = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			powerBall.add(new Integer(i));
		}

		for (int i = 0; i < 5; i++) {
			Collections.shuffle(powerBall);
			System.out.println(powerBall.get(i));
		
		}
	}

}
