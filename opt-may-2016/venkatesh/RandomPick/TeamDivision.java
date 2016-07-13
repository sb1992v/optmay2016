package RandomPick;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TeamDivision {

	public static void main(String[] args) {
		System.out.println("plese enter names...enter stop when done");

		Set people = new HashSet();

		Scanner input = new Scanner(System.in);

		String value = input.nextLine();
		do {

			people.add(value);
			System.out.println("enter next name");
			value = input.nextLine();
		} while (!value.equals("stop"));
		System.out.println("came out");
		Iterator itr = people.iterator();
		System.out.println("The first team members are:");
		int i = 0;
		while (itr.hasNext() && i < people.size() / 2) {

			System.out.println(itr.next());
			i++;
		}
		System.out.println("The second team members are:");

		while (itr.hasNext()) {

			System.out.println(itr.next());

		}
	}

}
