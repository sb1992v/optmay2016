package com.venkat.chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo1 {
	public static void main(String[] args) {
		List list = new Vector();
		list.add("hi");
		list.add("this is array list");
		list.add("Array list implemets list");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (Object li : list) {
			System.out.println(li);
		}
		List numbers = new Vector();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);

		for (Object number : numbers) {
			int num = (int) number;
			System.out.println(num);
		}

		Vector<Integer> no = new Vector<Integer>();
		no.add(133);
		no.add(547);
		for (int number : no) {
			System.out.println(number);
		}

	}
}
