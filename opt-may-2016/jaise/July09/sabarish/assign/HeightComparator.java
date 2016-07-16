package July09.sabarish.assign;

import java.util.Comparator;

public class HeightComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		StudentDetails s1 = (StudentDetails) o1;
		StudentDetails s2 = (StudentDetails) o2;
		if (s1.getHeight() > s2.getHeight()) {
			return 1;
		} else if (s1.getHeight() == s2.getHeight()) {
			return 0;
		} else {
			return -1;
		}
	}

}
