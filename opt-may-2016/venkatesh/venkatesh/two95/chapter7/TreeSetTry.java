package venkatesh.two95.chapter7;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTry {

	public static void main(String[] args) {

		Set set = new TreeSet();
		set.add("yo yo");
		set.add("honey");
		set.add("singh");

		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		Set num = new TreeSet();

		num.add(1);
		num.add(3);
		num.add(10);

		itr = num.iterator();
		while (itr.hasNext()) {
			int number = (int) itr.next();
			System.out.println(number);
		}
	}

}
