package venkatesh.two95.chapter7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {

		Set set = new HashSet();
		set.add("yo yo");
		set.add("honey");
		set.add("honey");
		set.add("singh");

		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
