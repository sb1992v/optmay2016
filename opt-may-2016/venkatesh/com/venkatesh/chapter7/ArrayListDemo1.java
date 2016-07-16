package com.venkatesh.chapter7;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("hi");
		list.add("this is array list");
		list.add("Array list implemets list");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (Object li : list) {
			System.out.println(li);
		}
		List numbers = new ArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);

		for (Object number : numbers) {
			int num = (int) number;
			System.out.println(num);
		}

		ArrayList<Integer> no = new ArrayList<Integer>();
		no.add(133);
		no.add(547);
		for (int number : no) {
			System.out.println(number);
		}

	}
}
