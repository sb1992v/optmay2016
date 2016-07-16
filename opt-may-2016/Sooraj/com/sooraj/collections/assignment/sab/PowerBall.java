package com.sooraj.collections.assignment.sab;

import java.util.*;

public class PowerBall {
	public static void main(String[] args) {
		int[] whiteballs = new int[5];
		System.out.println(
				"The winning number is a combination of 5 numbers chosen from White color balls and 1 number from Red color ball");
		System.out.println("-----------------------");
		

		for (int i = 0; i < 5; i++) {
			whiteballs[i] = (int) (Math.random() * 59 + 10);
			
		}
		
		Arrays.sort(whiteballs);
		for(int s:whiteballs){
			System.out.println(s);
		}
			
		

		
		for (int i = 0; i < 1; i++) {
			int s = (int) (Math.random() * 16 + 10);
			System.out.println(s);

		}
	}
}
