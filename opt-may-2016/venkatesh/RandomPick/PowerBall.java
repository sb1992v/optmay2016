package RandomPick;

import java.util.ArrayList;


public class PowerBall {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> newList = new ArrayList<Integer>();

		int min = 1;
		int max = 100;

		boolean typ = true;
		for (int i = 0; i < max - 1; i++) {
			list.add((int) (Math.random() * (max - min) + min));

		}

		System.out.println("first five powerball numbers");

		for (int i = 0; i < 5; i++) {
			if (!newList.contains(list.get(i))) {
				System.out.println(list.get(i));
				newList.add(list.get(i));
			}

		}
		System.out.println("second five powerball numbers");

		for (int i = 5; i <=10; i++) {
			if (!newList.contains(list.get(i))) {
				System.out.println(list.get(i));
				newList.add(list.get(i));
			}

		}
		System.out.println("third five powerball numbers");

		for (int i = 11; i <=15; i++) {
			if (!newList.contains(list.get(i))) {
				System.out.println(list.get(i));
				newList.add(list.get(i));
			}

		}

	}

}
