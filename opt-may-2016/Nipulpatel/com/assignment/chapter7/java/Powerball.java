/***************************************************************
 * @author Nipul								 date:7/11/2016 
 * project:Collection (Assignment 8)
 * Scope : Build a power ball program  using collections
 * Scope change : none
 * class : Main class
 * Test: Successfully every time  code shows new power ball number.
 * 		Successfully its tacks player's ticket number and
 * 		gives a winning price information  
 ***************************************************************/

package com.assignment.chapter7.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Powerball {

	public static void main(String[] args) {
		/************************ powerball1 ******************************/
		try {
			List<Integer> powerball1 = new ArrayList<>();

			int count = 0;

			for (int i = 0; i < 59; i++) {

				powerball1.add(count);

				count++;
			}

			Collections.shuffle(powerball1);

			int out = powerball1.get(1);

			/************************ powerball2 ******************************/
			List<Integer> powerball2 = new ArrayList<>();
			int count2 = 0;
			for (int i = 0; i < 59; i++) {

				powerball2.add(count2);

				count2++;
			}
			Collections.shuffle(powerball2);

			int out2 = powerball2.get(1);

			/************************ powerball3 ******************************/
			List<Integer> powerball3 = new ArrayList<>();
			int count3 = 0;
			for (int i = 0; i < 59; i++) {

				powerball3.add(count3);

				count3++;
			}
			Collections.shuffle(powerball3);

			int out3 = powerball3.get(1);

			/************************ powerball4 ******************************/

			List<Integer> powerball4 = new ArrayList<>();
			int count4 = 0;
			for (int i = 0; i < 59; i++) {

				powerball4.add(count4);

				count4++;
			}
			Collections.shuffle(powerball4);

			int out4 = powerball4.get(1);

			/************************ powerball5 ******************************/
			List<Integer> powerball5 = new ArrayList<>();
			int count5 = 0;
			for (int i = 0; i < 59; i++) {

				powerball5.add(count5);

				count5++;
			}
			Collections.shuffle(powerball5);

			int out5 = powerball5.get(1);

			/************************ power play ******************************/
			List<Integer> powerPlay = new ArrayList<>();
			int count6 = 0;

			for (int i = 0; i < 35; i++) {

				powerPlay.add(count6);

				count6++;
			}
			Collections.shuffle(powerPlay);

			int out6 = powerPlay.get(1);

			System.out.print(" Powerball is :- " + out);
			System.out.print(" " + out2);
			System.out.print(" " + out3);
			System.out.print(" " + out4);
			System.out.print(" " + out5);
			System.out.println(" *" + out6);

			/************************ Scanner ******************************/

			Scanner s = new Scanner(System.in);

			int n = 6;

			int arr[] = new int[n];

			System.out.println(" Enter a powerball Ticket number");
			for (int i = 0; i < n; i++) {// for reading array
				arr[i] = s.nextInt();

			}

			for (int i : arr) { // for printing array

				System.out.print(" " + i);

			}

			int arr2[] = { out, out2, out3, out4, out5, out6 };

			/************************ win check ******************************/
			if (arr[5] == arr2[5] && arr[4] == arr2[4] && arr[3] == arr2[3] && arr[2] == arr2[2] && arr[1] == arr2[1]
					&& arr[0] == arr2[0]) {

				System.out.println(" :-you won grand price ");

			}

			else if (

			arr[4] == arr2[4] && arr[3] == arr2[3] && arr[2] == arr2[2] && arr[1] == arr2[1] && arr[0] == arr2[0]

			) {

				System.out.println(" :-you won $1,000,000 dollers ");

			} else if (arr[5] == arr2[5] &&

					arr[3] == arr2[3] && arr[2] == arr2[2] && arr[1] == arr2[1] && arr[0] == arr2[0]) {

				System.out.println(" :-you won  $50,000 dollers ");

			} else if (

			arr[3] == arr2[3] && arr[2] == arr2[2] && arr[1] == arr2[1] && arr[0] == arr2[0]) {

				System.out.println(" :-you won $100 dollers ");

			} else if (arr[5] == arr2[5] &&

					arr[2] == arr2[2] && arr[1] == arr2[1] && arr[0] == arr2[0]) {

				System.out.println(" :-you won $100 dollers");

			} else if (

			arr[2] == arr2[2] && arr[1] == arr2[1] && arr[0] == arr2[0]) {

				System.out.println(" :-you won 7$ dollers ");

			} else if (arr[5] == arr2[5] &&

					arr[1] == arr2[1] && arr[0] == arr2[0]) {

				System.out.println(" :-you won 7$ dollers ");

			} else if (arr[5] == arr2[5] &&

					arr[0] == arr2[0]) {

				System.out.println(" :-you won 4$ dollers ");

			} else if (arr[5] == arr2[5]

			) {

				System.out.println(" :-you won 4$ dollers");

			} else {
				System.out.println(" :-you won 0 dollers");

			}
		} catch (java.util.InputMismatchException IME) {
			System.out.println("Exception Input Mismatch is handled ");
		}
		/************************ Winner ******************************/

	}
}
